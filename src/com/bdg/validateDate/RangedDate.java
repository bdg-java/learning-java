package com.bdg.validateDate;

public class RangedDate {
    private ValidDate originalDate;


    private RangedDate(ValidDate validDate) {
        this.originalDate = validDate;
    }

    public static RangedDate getInstance(ValueInRange dayRange, ValueInRange monthRange, ValueInRange yearRange) {
        if (!dayRange.isInRange() || !monthRange.isInRange() || !yearRange.isInRange()) {
            System.out.println("Invalid range ...");
            return null;
        }
        ValidDate instance = ValidDate.getInstance(dayRange.value(), monthRange.value(), yearRange.value());
        if (instance != null) {
            return new RangedDate(instance);
        }
        return null;
    }

    public int day() {
        return this.originalDate.day();
    }

    public int month() {
        return this.originalDate.month();
    }

    public int year() {
        return this.originalDate.year();
    }

    public String toString() {
        return originalDate.toString();
    }
}
