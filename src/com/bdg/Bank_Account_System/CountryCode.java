package com.bdg.Bank_Account_System;

public enum  CountryCode {
    ARM("+374", Country.AM),
    FR("+913", Country.FR),
    CN("+86", Country.CN);


    private String countryCode;
    private Country country;

     CountryCode(String countryCode, Country country){
        this.countryCode=countryCode;
        this.country=country;
    }


}
