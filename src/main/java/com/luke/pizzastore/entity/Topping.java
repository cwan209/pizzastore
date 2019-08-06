package com.luke.pizzastore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Topping {

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
    private String imageUrl;

    @OneToMany(mappedBy = "topping")
    private Set<PizzaIngredient> pizzaIngredients;
}
