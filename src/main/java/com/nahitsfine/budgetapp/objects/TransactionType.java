
package com.nahitsfine.budgetapp.objects;

import com.nahitsfine.budgetapp.objects.enums.TransactionTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionType {
    private final TransactionTypeEnum transactionTypeKey;
    private final int period;
}
