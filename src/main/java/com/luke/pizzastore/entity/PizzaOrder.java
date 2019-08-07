package com.luke.pizzastore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@AllArgsConstructor
public class PizzaOrder {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String customerName;

    @Column
    private String mobile;

    @Column
    private int unitNo;

    @Column
    private int streetNo;

    @Column
    private String streetName;

    @Column
    private String suburb;

    @Column
    private String state;

    @Column
    private String postcode;

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

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
}
