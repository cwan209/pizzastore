package com.luke.pizzastore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Voucher {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String number;

    @Column
    private double balance;

    @Column
    private long reference;

    @OneToMany(mappedBy = "voucher")
    private List<VoucherUsage> voucherUsages;

    @Column
    @CreationTimestamp
    private Date createdAt;

    @Column
    @UpdateTimestamp
    private Date updatedAt;
}
