package com.luke.pizzastore.model;

import lombok.Data;

import java.util.List;

@Data
public class OrderItemDTO {

    private int pizzaTypeId;

    private int amount;

    private List<ToppingDTO> toppings;
}
