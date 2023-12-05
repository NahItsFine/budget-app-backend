package com.nahitsfine.budgetapp.controllers;

import com.nahitsfine.budgetapp.enums.TransactionFrequencyTypes;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TransactionFrequencyTypeController {
    @GetMapping("/TransactionFrequencyTypess")
    public List<TransactionFrequencyTypes> getAllTransactionTypesKeys() {
        return Arrays.asList(TransactionFrequencyTypes.values());
    }
}
