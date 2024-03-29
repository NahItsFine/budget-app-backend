package com.nahitsfine.budgetapp.enums;

/**
 * Enum of all supported transaction types.
 * FIXED = some recurrence, same amount
 * RECUR = some recurrence, varying amounts
 * VARIABLE = one-time transaction, any day, any amount
 */
public enum TransactionTypes {
    FIXED(true, true),
    RECUR(true, false),
    VARIABLE(false, false);

    private boolean isRecurring;
    private boolean hasRecurringAmount;

    private TransactionTypes (boolean isRecurring, boolean hasRecurringAmount) {
        this.isRecurring = isRecurring;
        this.hasRecurringAmount = hasRecurringAmount;
    }

    public boolean getRecurringBool() {
        return this.isRecurring;
    }

    public boolean getRecurringAmountBool() {
        return this.hasRecurringAmount;
    }
}