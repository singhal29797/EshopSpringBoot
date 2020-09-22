package com.upgrad.eshop.controllers;

import com.upgrad.eshop.dtos.EshopUserDTO;
import com.upgrad.eshop.exceptions.EshopUserDetailsNotFoundException;
import com.upgrad.eshop.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")

public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody EshopUserDTO registerRequest) throws EshopUserDetailsNotFoundException {
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successfull",HttpStatus.OK);

    }
}
