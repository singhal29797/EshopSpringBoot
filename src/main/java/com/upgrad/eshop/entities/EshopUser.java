package com.upgrad.eshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "eshop_user")
public class EshopUser {

    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true, nullable = false)
    private Date created;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    @Column(nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String role;
    @Column(unique = true, nullable = false)
    private String userName;
    @Column(nullable = false)
    private String updated;
    @OneToMany(mappedBy = "eshopOrder", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    List<EshopOrder> eshopOrders;


}
