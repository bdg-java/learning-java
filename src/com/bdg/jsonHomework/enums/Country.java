package com.bdg.jsonHomework.enums;

import com.bdg.jsonHomework.Exception.ItemsNotFoundException;

public enum Country {
    AM("Armenia" ,"051");

    public String countryName;
    public String numercCode;
    Country(String countryName, String numercCode) {
        this.countryName = countryName;
        this.numercCode = numercCode;
    }

    public static Country findByName(String countryName) {
        Country found = null;




        for (Country value : values()) {
            if (value.name().equalsIgnoreCase(countryName)) {
                found = value;
            }
        }


        return found;

    }
}
