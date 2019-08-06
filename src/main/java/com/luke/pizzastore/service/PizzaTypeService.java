package com.luke.pizzastore.service;

import com.luke.pizzastore.entity.PizzaType;
import com.luke.pizzastore.repository.PizzaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaTypeService {

    @Autowired
    private PizzaTypeRepository pizzaTypeRepository;

    public List<PizzaType> findAll() {
        return pizzaTypeRepository.findAll();
    }
}
