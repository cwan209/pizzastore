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
public class PizzaOrder {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String customerName;

    @Column
    private String mobile;

    @Column
    private String unitNo;

    @Column
    private String streetNo;

    @Column
    private String streetName;

    @Column
    private String suburb;

    @Column
    private String state;

    @Column
    private String postCode;

    @Column
    private double totalPrice;

    @Column
    private String status;

    @Column
    @CreationTimestamp
    private Date createdAt;

    @Column
    @UpdateTimestamp
    private Date updatedAt;

    @OneToMany(mappedBy = "order")
    private Set<OrderItem> orderItems;
}
