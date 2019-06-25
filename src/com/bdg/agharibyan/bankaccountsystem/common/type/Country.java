package com.bdg.agharibyan.bankaccountsystem.common.type;

public enum Country {
    AM("Armenia", "051"),
    BR("Brazil", "076"),
    LK("Sri Lanka", "144"),
    FR("France", "250"),
    GE("Georgia", "268"),
    GR("Greece", "300");

    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode){
        this.countryName = countryName;
        this.numericCode = numericCode;
    }
}
