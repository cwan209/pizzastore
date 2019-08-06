package com.luke.pizzastore.repository;

import com.luke.pizzastore.entity.PizzaType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzaTypeRepository extends CrudRepository<PizzaType, Long> {
    List<PizzaType> findAll();
}
