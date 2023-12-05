package com.nahitsfine.budgetapp.objects;

import com.nahitsfine.budgetapp.abstracts.AbstractTransactionTemplate;
import com.nahitsfine.budgetapp.enums.TransactionFrequencyTypes;
import com.nahitsfine.budgetapp.enums.TransactionTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

import static com.nahitsfine.budgetapp.util.DateUtil.*;

@Data
@RequiredArgsConstructor
public class RecurTransactionTemplate extends AbstractTransactionTemplate {
    private Date startDate;
    private Date endDate; // opt
    private Date nextTransactionDate; // opt, should be set by ctor
    private TransactionFrequencyTypes frequencyType;
    private int frequencyValue;

    public Date getNextTransaction() {
        if(this.nextTransactionDate == null || this.endDate == null) return null;

        if (this.frequencyType == TransactionFrequencyTypes.EVERY_X_DAYS) {
            return addDays(this.nextTransactionDate, this.endDate, this.frequencyValue);
        } else if (this.frequencyType == TransactionFrequencyTypes.EVERY_X_WEEKS) {
            return addWeeks(this.nextTransactionDate, this.endDate, this.frequencyValue);
        } else if (frequencyType == TransactionFrequencyTypes.EVERY_X_MONTHS) {
            return addMonths(this.nextTransactionDate, this.startDate, this.endDate, this.frequencyValue);
        } else {
            return null;
        }
    }
}
