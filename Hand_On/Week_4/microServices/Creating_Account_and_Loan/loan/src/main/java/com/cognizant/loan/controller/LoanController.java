package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoanController {
    @GetMapping("/account/{number}")
    public Map<String, Object> getLoan(@PathVariable String number){
        Map<String, Object> loan = new HashMap<>();
        loan.put("number", number);
        loan.put("type", "Car");
        loan.put("Loan", 1200000);
        loan.put("emi", 9000);
        loan.put("tenure",25);
        return loan;
    }
}
