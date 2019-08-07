package com.luke.pizzastore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue
    private long id;

    @Column
    @CreationTimestamp
    private Date createdAt;

    @Column
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private PizzaOrder order;

    @Column(name = "pizza_type_id")
    private long pizzaType;

    @OneToMany(mappedBy = "orderItem")
    private List<OrderItemTopping> orderItemToppings;

    @Column
    private int amount;

    @Column
    private double unitPrice;

    @Column
    private String size;
}
