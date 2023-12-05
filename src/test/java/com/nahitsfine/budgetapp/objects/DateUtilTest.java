package com.nahitsfine.budgetapp.objects;

import java.util.Calendar;
import java.util.Date;

import com.nahitsfine.budgetapp.util.DateUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class DateUtilTest {
    @Test
    void addDaysTest(){
        Date testDate = new Date(2023,0,1);
        Date testEndDate = new Date(2024,0,1);
        Date expectedDate = new Date(2023,0,8);

        Date newDate = DateUtil.addDays(testDate, testEndDate, 7);
        Assertions.assertTrue(newDate.equals(expectedDate));
    }

    @Test
    void addDaysPastEndOfMonthTest(){
        Date testDate = new Date(2023,0,1);
        Date testEndDate = new Date(2024,0,1);
        Date expectedDate = new Date(2023,1,1);

        Date newDate = DateUtil.addDays(testDate, testEndDate, 31);
        Assertions.assertTrue(newDate.equals(expectedDate));
    }

    @Test
    void addDaysPastEndDate(){
        Date testDate = new Date(2023,0,1);
        Date testEndDate = new Date(2024,0,1);

        Date newDate = DateUtil.addDays(testDate, testEndDate, 366);
        Assertions.assertNull(newDate);
    }

    @Test
    void addWeeksTest(){
        Date testDate = new Date(2023,0,1);
        Date testEndDate = new Date(2024,0,1);
        Date expectedDate = new Date(2023,0,8);

        Date newDate = DateUtil.addWeeks(testDate, testEndDate, 1);
        Assertions.assertTrue(newDate.equals(expectedDate));
    }

    @Test
    void addWeeksPastEndDateTest(){
        Date testDate = new Date(2023,0,1);
        Date testEndDate = new Date(2024,0,1);

        Date newDate = DateUtil.addWeeks(testDate, testEndDate, 53);
        Assertions.assertNull(newDate);
    }

    @Test
    void addMonthsTest(){
        Date testStartDate = new Date(2022,0,1);
        Date testDate = new Date(2023,0,1);
        Date testEndDate = new Date(2024,0,1);
        Date expectedDate = new Date(2023,10,1);

        Date newDate = DateUtil.addMonths(testDate, testStartDate, testEndDate, 11);
        Assertions.assertTrue(newDate.equals(expectedDate));
    }

    // TODO JJ CAN HAVE MULTIPLE ASSERTS IN A METHOD, YOU CAN COMBINE THESE METHODS
    // ADD TEST FOR MONTHS TO GO PAST A YEAR BEFORE ENDDATE

    @Test
    void addMonthsWhenEndOfMonthDayIsLowerThanOriginal(){
        Date testStartDate = new Date(2022,0,31);
        Date testDate = new Date(2023,0,31);
        Date testEndDate = new Date(2024,0,1);
        Date expectedDate = new Date(2023,1,28);

        Date newDate = DateUtil.addMonths(testDate, testStartDate, testEndDate, 1);
        Assertions.assertTrue(newDate.equals(expectedDate));
    }
}
