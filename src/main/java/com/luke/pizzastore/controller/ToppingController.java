package com.luke.pizzastore.controller;

import com.luke.pizzastore.entity.Topping;
import com.luke.pizzastore.service.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topping")
public class ToppingController {

    @Autowired
    private ToppingService toppingService;

    @GetMapping("")
    public List<Topping> index() {
        return toppingService.findAll();
    }
}
