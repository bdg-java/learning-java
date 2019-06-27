package com.bdg.validateDate;

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
    }
}
