package com.lesson11.enumentity;

public enum Country {

    AM("Armenia", "051"),
    CN("China", "156"),
    AU("Australia", "36"),
    RU("Russian Federation", "643");


    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

    @Override
    public String toString() {
        return this.countryName + ", " + this.numericCode;
    }
}
