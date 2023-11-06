package com.nahitsfine.budgetapp.controllers;

import com.nahitsfine.budgetapp.objects.enums.TransactionFrequencyTypeKey;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TransactionFrequencyTypeController {
    @GetMapping("/objects/transactionFrequencyTypeKeys")
    public List<TransactionFrequencyTypeKey> getAllTransactionTypeEnumKeys() {
        return Arrays.asList(TransactionFrequencyTypeKey.values());
    }
}
