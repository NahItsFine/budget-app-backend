package com.nahitsfine.budgetapp.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date addDays(final Date date, final Date endDate, final int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);

        final Date newDate = c.getTime();
        return newDate.before(endDate) ? newDate : null;
    }

    public static Date addWeeks(final Date date, final Date endDate, final int weeks) {
        return addDays(date, endDate, weeks * 7);
    }

    /**
     * Return the date + number of months. Will attempt to place the date on the same startdate, or put it
     * on the closest date otherwise.
     * @param date
     * @param startDate
     * @param months
     * @return
     */
    public static Date addMonths(final Date date, final Date startDate, final Date endDate, final int months) {
        Calendar cal = Calendar.getInstance();

        // Get Original Day of Month
        cal.setTime(startDate);
        final int originalDayOfMonth = cal.get(Calendar.DAY_OF_MONTH); //31

        // Add months to date
        cal.setTime(date);
        cal.add(Calendar.MONTH, months);

        // Check if date is valid, if not, set cal to last day of the month
        final int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //28
        if(originalDayOfMonth > lastDayOfMonth) // 31 > 28
        {
            cal.set(Calendar.DAY_OF_MONTH, lastDayOfMonth); //28
        }

        final Date newDate = cal.getTime();
        return newDate.before(endDate) ? newDate : null;
    }
}
