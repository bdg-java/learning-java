package com.bdg.repetition.bankaccount.bankaccountservice.common;

public enum Country {
    ARM("Armenia"),
    RU("Russia");

    private String countryName;

    Country(String countryName){
        this.countryName = countryName;
    }

    public static Country findByName(String countryName){
        Country found = null;
        for(Country value:values()){
            if(value.name().equalsIgnoreCase(countryName)){
                found = value;
            }
        }
        return found;
    }
}
