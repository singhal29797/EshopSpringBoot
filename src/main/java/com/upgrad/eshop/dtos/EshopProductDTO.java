package com.upgrad.eshop.dtos;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class EshopProductDTO {

    private int productId;
    private int availableItems;
    private String category;
    private Date created;
    private String description;
    private String imageURL;
    private String manufacturer;
    private String name;
    private double price;
    private Date updated;

}
