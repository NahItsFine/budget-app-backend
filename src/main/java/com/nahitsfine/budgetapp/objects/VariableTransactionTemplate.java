package com.nahitsfine.budgetapp.objects;

import com.nahitsfine.budgetapp.enums.TransactionFrequencyTypes;
import com.nahitsfine.budgetapp.enums.TransactionTypes;
import com.nahitsfine.budgetapp.abstracts.AbstractTransactionTemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class VariableTransactionTemplate extends AbstractTransactionTemplate {
    // variable transaction template ctor to fill in type field
}
