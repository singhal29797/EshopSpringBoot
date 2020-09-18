package com.upgrad.eshop.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "eshop_order")
public class EshopOrder {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private Date orderDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference
    EshopUser userId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference
    EshopShippingAddress shippingAddressId;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference
    EshopOrder productProductId;


}
