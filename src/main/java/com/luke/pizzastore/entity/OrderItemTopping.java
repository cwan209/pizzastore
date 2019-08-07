package com.luke.pizzastore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Builder
@AllArgsConstructor
public class OrderItemTopping {

    @Id
    @GeneratedValue
    private long id;

//    @ManyToOne
    @Column(name = "topping_id", nullable = false)
    private long topping;

    @ManyToOne
    @JoinColumn(name = "order_item_id", nullable = false)
    private OrderItem orderItem;

    @Column
    private int amount;

    @Column
    private double unitPrice;
}
