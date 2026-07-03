package com.cognizant.spring_learn_JWT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @GetMapping("/authenticate")
    public String authenticate(){
        return "Authentication end point";
    }
}
