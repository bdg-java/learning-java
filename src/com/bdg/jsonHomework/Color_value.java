package com.bdg.jsonHomework;

public class Color_value {
    private String color;
    private String value;

    Color_value(String color, String value){
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
