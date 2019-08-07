package com.luke.pizzastore.controller;

import com.luke.pizzastore.request.PizzaOrderRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pizzaOrder")
public class PizzaOrderController {

    @PostMapping("")
    public void post(@Valid @RequestBody PizzaOrderRequest request) {

    }
}