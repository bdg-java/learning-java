package com.BankAccount.entity;

import com.BankAccount.common.CountryCode;
import com.BankAccount.common.PhoneType;

public class PhoneNumber extends AbstractBankEntity {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof PhoneNumber) {
            return (this.countryCode == ((PhoneNumber) obj).countryCode
                    && this.type == ((PhoneNumber) obj).type
                    && this.number == ((PhoneNumber) obj).number);
        }
        return false;
    }

    public String toString() {
        return this.countryCode + " , " + this.number + " , " + this.type;
    }
}
