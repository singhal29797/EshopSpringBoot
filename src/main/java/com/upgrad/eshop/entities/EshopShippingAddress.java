package com.upgrad.eshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "eshop_shipping_address")
public class EshopShippingAddress {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String landmark;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String zipCode;
    @OneToMany(mappedBy = "eshopOrder",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    List<EshopOrder> eshopOrders;

}
