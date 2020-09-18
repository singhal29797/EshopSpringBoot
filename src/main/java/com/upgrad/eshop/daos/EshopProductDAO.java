package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.EshopProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("EshopProductDAO")
public interface EshopProductDAO extends JpaRepository<EshopProduct, Integer> {


}
