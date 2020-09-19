package com.upgrad.eshop.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.upgrad.eshop.entities.EshopOrder;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
public class EshopUserDTO {

    private int id;
    private Date created;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String role;
    private String userName;
    private String updated;

}

