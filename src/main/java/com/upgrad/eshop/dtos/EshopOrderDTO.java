package com.upgrad.eshop.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.upgrad.eshop.entities.EshopOrder;
import com.upgrad.eshop.entities.EshopShippingAddress;
import com.upgrad.eshop.entities.EshopUser;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class EshopOrderDTO {

    private int id;
    private double amount;
    private Date orderDate;

}
