package com.bdg.agharibyan.bankaccountsystem.entity;

import com.bdg.agharibyan.bankaccountsystem.common.type.CountryCode;
import com.bdg.agharibyan.bankaccountsystem.common.type.PhoneType;

public final class PhoneNumber extends AbstractBankEntity {

    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type){
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }

    public String toString(){
        return "PhoneNumber: {"+ type + '\'' + countryCode + number + '\'' +
                "}";
    }
}
