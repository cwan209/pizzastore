package com.luke.pizzastore.model;

import lombok.Data;

import java.util.List;

@Data
public class PizzaOrderDTO {

    private ContactDTO contact;

    private AddressDTO address;

    private List<OrderItemDTO> orderItems;
}