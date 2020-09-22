package com.upgrad.eshop.services;

import com.upgrad.eshop.dtos.EshopUserDTO;
import com.upgrad.eshop.entities.EshopUser;
import com.upgrad.eshop.exceptions.EshopUserDetailsNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    public EshopUser signup(EshopUserDTO data) throws EshopUserDetailsNotFoundException;
}
