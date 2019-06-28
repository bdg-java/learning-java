package com.bdg.agharibyan.bankaccountsystem.common.type;

public enum CountryCode {
    ARM("+374", Country.AM),
    BRA("+55", Country.BR),
    LKA("+94", Country.LK),
    FRA("+33", Country.FR),
    GEO("+995", Country.GE),
    poghosyan("ss", Country.poghos),

    GRC("+30", Country.GR);


    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country){
        this.countryCode = countryCode;
        this.country = country;
    }
}
