package com.luke.pizzastore.service;

import com.luke.pizzastore.entity.OrderItem;
import com.luke.pizzastore.entity.OrderItemTopping;
import com.luke.pizzastore.entity.PizzaOrder;
import com.luke.pizzastore.entity.Topping;
import com.luke.pizzastore.model.PizzaOrderDTO;
import com.luke.pizzastore.repository.PizzaOrderRepository;
import com.luke.pizzastore.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaOrderService {

    @Autowired
    PizzaOrderRepository pizzaOrderRepository;

    @Autowired
    ToppingRepository toppingRepository;

    public void createOrder(PizzaOrderDTO pizzaOrderDTO) {
        List<OrderItem> orderItems = getOrderItems(pizzaOrderDTO);
        PizzaOrder pizzaOrder = getPizzaOrder(pizzaOrderDTO, orderItems);

        pizzaOrderRepository.save(pizzaOrder);
    }

    private PizzaOrder getPizzaOrder(PizzaOrderDTO pizzaOrderDTO, List<OrderItem> orderItems) {
        PizzaOrder pizzaOrder = new PizzaOrder();

        pizzaOrder.setMobile(pizzaOrderDTO.getContact().getMobile());
        pizzaOrder.setCustomerName(pizzaOrderDTO.getContact().getCustomerName());

        pizzaOrder.setPostcode(pizzaOrderDTO.getAddress().getPostcode());
        pizzaOrder.setState(pizzaOrderDTO.getAddress().getState());
        pizzaOrder.setStreetName(pizzaOrderDTO.getAddress().getStreetName());
        pizzaOrder.setStreetNo(pizzaOrderDTO.getAddress().getStreetNo());
        pizzaOrder.setSuburb(pizzaOrderDTO.getAddress().getSuburb());

        pizzaOrder.setOrderItems(orderItems);
        return pizzaOrder;
    }

    private List<OrderItem> getOrderItems(PizzaOrderDTO pizzaOrderDTO) {
        List<OrderItem> orderItems = new ArrayList<>();

        pizzaOrderDTO.getOrderItems().forEach( orderItemDTO -> {

            OrderItem orderItem = new OrderItem();
            orderItem.setAmount(orderItemDTO.getAmount());
            orderItem.setPizzaType(orderItemDTO.getPizzaTypeId());

            List<OrderItemTopping> orderItemToppings = new ArrayList<>();
            orderItemDTO.getToppings().forEach(toppingDTO -> {
                OrderItemTopping orderItemTopping = new OrderItemTopping();
                orderItemTopping.setAmount(toppingDTO.getAmount());
                orderItemTopping.setTopping(toppingDTO.getToppingId());

                Topping topping = toppingRepository.findById(toppingDTO.getToppingId()).get();
                orderItemTopping.setUnitPrice(topping.getUnitPrice());
                orderItemTopping.setOrderItem(orderItem);

                orderItemToppings.add(orderItemTopping);
            });

            orderItem.setOrderItemToppings(orderItemToppings);
            orderItems.add(orderItem);
        });

        return orderItems;
    }
}
