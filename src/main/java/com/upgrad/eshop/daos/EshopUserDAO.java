package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.EshopUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("EshopUserDAO")
public interface EshopUserDAO extends JpaRepository<EshopUser, Integer> {


}
