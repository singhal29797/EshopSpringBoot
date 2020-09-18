package com.upgrad.eshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "eshop_product")
public class EshopProduct {

    @Id
    @GeneratedValue
    private int productId;
    @Column(nullable = false)
    private int availableItems;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Date created;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String imageURL;
    @Column(nullable = false)
    private String manufacturer;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private Date updated;


}
