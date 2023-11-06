package com.nahitsfine.budgetapp.objects.enums;

// JUnit, AssertJ, Mockito
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TransactionTypeEnumTest {
    @Test
    void isRecurringTest() {
        assertTrue(TransactionTypeEnum.FIXED.getRecurringBool());
        assertTrue(TransactionTypeEnum.RECUR.getRecurringBool());
        assertFalse(TransactionTypeEnum.VARIABLE.getRecurringBool());
    }

    @Test
    void hasRecurringAmountTest() {
        assertTrue(TransactionTypeEnum.FIXED.getRecurringAmountBool());
        assertFalse(TransactionTypeEnum.RECUR.getRecurringAmountBool());
        assertFalse(TransactionTypeEnum.VARIABLE.getRecurringAmountBool());
    }
}
