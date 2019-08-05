package com.luke.pizzastore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class PizzaIngredient {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "topping_id", nullable = false)
    private Topping topping;

    @ManyToOne
    @JoinColumn(name = "pizza_type_id", nullable = false)
    private PizzaType pizzaType;

    @Column
    private double amount;
}
