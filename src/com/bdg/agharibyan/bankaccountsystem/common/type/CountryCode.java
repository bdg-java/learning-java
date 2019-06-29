package com.bdg.agharibyan.bankaccountsystem.common.type;

import com.bdg.agharibyan.bankaccountsystem.common.exception.CountryCodeNotFoundException;

public enum CountryCode {
    ARM("+374", Country.AM),
    BRA("+55", Country.BR),
    LKA("+94", Country.LK),
    FRA("+33", Country.FR),
    GEO("+995", Country.GE),
    GRC("+30", Country.GR);


    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country){
        this.countryCode = countryCode;
        this.country = country;
    }

    public static CountryCode find (String countryCode){ // chem karoghanum kanchel ays methody PhoneNumberCrudum
        CountryCode found = null;
        for(CountryCode value: values()){
            if(value.name().equalsIgnoreCase(countryCode)){
                found = value;
            }
        }
        if(found == null){
            throw new CountryCodeNotFoundException(countryCode);
        }
        return found;
    }
}
