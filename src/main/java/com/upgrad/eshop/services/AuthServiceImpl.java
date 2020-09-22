package com.upgrad.eshop.services;

import com.upgrad.eshop.daos.EshopUserDAO;
import com.upgrad.eshop.dtos.EshopUserDTO;
import com.upgrad.eshop.entities.EshopUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    @Qualifier("eshopUserDAO")
    EshopUserDAO eshopUserDAO;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Transactional
    public EshopUser signup(EshopUserDTO data) {
        EshopUser user = new EshopUser();
        user.setUserName(data.getUserName());
        user.setEmail(data.getEmail());
        user.setPassword(passwordEncoder.encode(data.getPassword()));
        eshopUserDAO.save(user);

        return user;



    }

}

