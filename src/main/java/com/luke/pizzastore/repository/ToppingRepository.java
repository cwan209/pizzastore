package com.luke.pizzastore.repository;

import com.luke.pizzastore.entity.Topping;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ToppingRepository extends CrudRepository<Topping, Long> {
    List<Topping> findAll();
    Optional<Topping> findById(Long id);
}
