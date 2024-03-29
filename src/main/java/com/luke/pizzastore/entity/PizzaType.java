package com.luke.pizzastore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class PizzaType {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double unitPrice;

    @Column
    private String size;

    @Column
    private String imageUrl;

    @OneToMany(mappedBy = "pizzaType")
    private Set<PizzaIngredient> pizzaIngredients;

    // many to many
//    @OneToMany(mappedBy = "pizzaType")
//    private Set<OrderItem> orderItems;
}
