package com.bdg.validateDate;

public class ValueInRange {
    private int start;
    private int value;
    private int end;

    public ValueInRange(int start, int value, int end) {
        this.start = start;
        this.value = value;
        this.end = end;
    }

    public int value() {
        return this.value;
    }

    public boolean isInRange() {
        return value >= start && value <= end;
    }
}
