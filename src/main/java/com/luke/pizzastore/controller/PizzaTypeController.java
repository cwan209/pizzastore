package com.luke.pizzastore.controller;

import com.luke.pizzastore.entity.PizzaType;
import com.luke.pizzastore.service.PizzaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pizzaType")
public class PizzaTypeController {

    @Autowired
    private PizzaTypeService pizzaTypeService;

    @GetMapping("")
    public List<PizzaType> index() {
        List<PizzaType> pizzaTypes = pizzaTypeService.findAll();
        return pizzaTypes;
    }
}
