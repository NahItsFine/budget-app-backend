package com.nahitsfine.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionTypeController {

    @GetMapping("/hello")
    public String index() {
        return "It iiiiiissss what it issssss.";
    }
}
