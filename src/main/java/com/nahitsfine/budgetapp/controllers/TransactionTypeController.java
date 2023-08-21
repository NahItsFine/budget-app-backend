package com.nahitsfine.budgetapp.controllers;

import com.nahitsfine.budgetapp.businessobjects.enums.TransactionTypeEnum;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionTypeController {
    @GetMapping("/transactionTypes")
    public List<TransactionTypeEnum> getAllTransactionTypes() {
        return Arrays.asList(TransactionTypeEnum.values());
    }
}
