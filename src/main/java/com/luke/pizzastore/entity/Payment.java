package com.luke.pizzastore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long orderId;

    @Column
    private double amount;

    @Column
    private long reference;

    @OneToMany(mappedBy = "payment")
    private List<VoucherUsage> voucherUsages;


}
