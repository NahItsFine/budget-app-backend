package com.nahitsfine.budgetapp.enums;

// JUnit, AssertJ, Mockito
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.nahitsfine.budgetapp.enums.TransactionTypes;
import org.junit.jupiter.api.Test;

public class TransactionTypesTest {
    @Test
    void isRecurringTest() {
        assertTrue(TransactionTypes.FIXED.getRecurringBool());
        assertTrue(TransactionTypes.RECUR.getRecurringBool());
        assertFalse(TransactionTypes.VARIABLE.getRecurringBool());
    }

    @Test
    void hasRecurringAmountTest() {
        assertTrue(TransactionTypes.FIXED.getRecurringAmountBool());
        assertFalse(TransactionTypes.RECUR.getRecurringAmountBool());
        assertFalse(TransactionTypes.VARIABLE.getRecurringAmountBool());
    }
}
