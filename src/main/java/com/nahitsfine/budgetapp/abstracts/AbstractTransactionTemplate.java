package com.nahitsfine.budgetapp.abstracts;

import com.nahitsfine.budgetapp.enums.TransactionFrequencyTypes;
import com.nahitsfine.budgetapp.enums.TransactionTypes;

import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.UUID;

import static com.nahitsfine.budgetapp.util.DateUtil.*;

/**
 * Interface for transaction template.
 */
@AllArgsConstructor
public abstract class AbstractTransactionTemplate {
    private final UUID id;
    private final UUID accountId;
    private final TransactionTypes transactionType;
    private String name;
    private String description;
}
