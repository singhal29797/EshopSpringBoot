package com.upgrad.eshop.services;

import com.upgrad.eshop.daos.EshopUserDAO;
import com.upgrad.eshop.dtos.EshopUserDTO;
import com.upgrad.eshop.dtos.ForgetPWDDTO;
import com.upgrad.eshop.dtos.LoginDTO;
import com.upgrad.eshop.entities.EshopUser;
import com.upgrad.eshop.exceptions.APIException;
import com.upgrad.eshop.exceptions.UserNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

public class EshopUserServiceImpl implements  EshopUserService{
    public UserDetails loadUserDetails(String email) {


    }

    @Override
    public EshopUser getUserDetails(LoginDTO loginDTO) throws Exception {

        EshopUser checkUser = eshopUserDAO.findByEmail(loginDTO.getEmail());
        if (checkUser == null){
            throw new APIException("User Not Registered");
        }
        EshopUser user = EshopUserDAO.findByEmailAndPassword(loginDTO.getEmail(), loginDTO.getPassword());
        if (user == null){
            throw new UserNotFoundException("Unauthorized User");
        }
        return user;
    }

    @Override
    public EshopUser createUser(EshopUserDTO eshopUsers) throws Exception {
        User returnedUser = userDAO.findByEmail(userDTO.getEmail());
        if ( returnedUser != null) {
            throw new UserAlreadyExistsException("Email Already Exists");
        }
        User returnedUser1 = userDAO.findByMobileNo(userDTO.getMobileNo());
        if (returnedUser1 != null) {
            throw new UserAlreadyExistsException("Mobile Number Already Exists");
        }
        User user = new User();
        user.setWalletMoney(10000);
        user.setUserRole(userRoleDAO.findByRoleId(2)); //RoleId:2 for User
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setMobileNo(userDTO.getMobileNo());
        User savedUser = userDAO.save(user);
        return savedUser;
    }

    @Override
    public Boolean updatePassword(ForgetPWDDTO forgetPWDDTO) throws Exception {

        User user = userDAO.findByEmailAndMobileNo(forgetPWDDTO.getEmail(), forgetPWDDTO.getMobileNo());
        if(user == null){
            throw new APIException("Invalid Email/Mobile Number");
        }
        String currentPassword = user.getPassword();
        if(user != null && !currentPassword.equals(forgetPWDDTO.getPassword())) {
            user.setPassword(forgetPWDDTO.getPassword());
            userDAO.save(user);
            return true;
        } else {
            throw new APIException("The new password should be different from the existing one");
        }

    }

    public UserDetails loadUserDetails(String email) throws UserNotFoundException {
        //JWT: Changed Email
        User user = userDAO.findByEmail(email);
        if (user == null) {
            throw new UserNotFoundException("No User Available" + email);
        }
        return  new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword() , new ArrayList<>());
    }
}
