package com.luke.pizzastore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class OrderItemTopping {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "topping_id", nullable = false)
    private Topping topping;

    @ManyToOne
    @JoinColumn(name = "order_item_id", nullable = false)
    private OrderItem orderItem;

    @Column
    private int amount;

    @Column
    private int unitPrice;
}
