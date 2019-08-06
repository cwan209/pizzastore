package com.luke.pizzastore.repository;

import com.luke.pizzastore.entity.Topping;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToppingRepository extends CrudRepository<Topping, Long> {
    List<Topping> findAll();
}
