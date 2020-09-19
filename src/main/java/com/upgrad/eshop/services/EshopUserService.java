package com.upgrad.eshop.services;

import com.upgrad.eshop.dtos.EshopUserDTO;
import com.upgrad.eshop.dtos.ForgetPWDDTO;
import com.upgrad.eshop.dtos.LoginDTO;
import com.upgrad.eshop.entities.EshopUser;

public interface EshopUserService {


    EshopUser getUserDetails(LoginDTO loginDTO) throws Exception;
    EshopUser createUser(EshopUserDTO eshopUsers) throws Exception;
    Boolean updatePassword(ForgetPWDDTO forgetPWDDTO) throws Exception;
}
