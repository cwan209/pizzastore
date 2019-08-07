package com.luke.pizzastore.controller;

import com.luke.pizzastore.model.PizzaOrderDTO;
import com.luke.pizzastore.service.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pizzaOrder")
public class PizzaOrderController {

    @Autowired
    PizzaOrderService pizzaOrderService;

    @PostMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void post(@Valid @RequestBody PizzaOrderDTO pizzaOrderDTO) {

        pizzaOrderService.createOrder(pizzaOrderDTO);

    }
}