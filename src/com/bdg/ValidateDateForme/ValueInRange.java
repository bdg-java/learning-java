package com.bdg.ValidateDateForme;

public class ValueInRange {
    private int value;
    private int start;
    private int end;

    public ValueInRange(int start, int value, int end) {
        this.start = start;
        this.value = value;
        this.end = end;
    }

    public int value(){
        return this.value;
    }

    public boolean isinRange(){
        return value <= start && value >= start;
    }
}
