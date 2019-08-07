package com.luke.pizzastore.repository;

import com.luke.pizzastore.entity.PizzaOrder;
import org.springframework.data.repository.CrudRepository;


public interface PizzaOrderRepository extends CrudRepository<PizzaOrder, Long> {

}
