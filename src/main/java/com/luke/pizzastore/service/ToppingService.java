package com.luke.pizzastore.service;

import com.luke.pizzastore.entity.PizzaType;
import com.luke.pizzastore.entity.Topping;
import com.luke.pizzastore.repository.PizzaTypeRepository;
import com.luke.pizzastore.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppingService {

    @Autowired
    private ToppingRepository toppingRepository;

    public List<Topping> findAll() {
        return toppingRepository.findAll();
    }
}
