package com.upgrad.eshop.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.upgrad.eshop.entities.EshopOrder;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class EshopShippingAddressDTO {

    private int id;
    private String city;
    private String landmark;
    private String name;
    private String phoneNumber;
    private String state;
    private String street;
    private String zipCode;

}
