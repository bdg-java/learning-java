package com.bdg.composition;

import com.bdg.enums.DayOfWeek;

public class DateDemo {

    public static void main(String[] args) {

        RangedDate rangedDate = RangedDate.getInstance(
                new ValueInRange(6, 4, 31),
                new ValueInRange(-5, -1, 12),
                new ValueInRange(1900, 2019, 2020)
        );

        if (rangedDate != null) {
            System.out.println(rangedDate);
        }

        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday.shortName());
    }
}
