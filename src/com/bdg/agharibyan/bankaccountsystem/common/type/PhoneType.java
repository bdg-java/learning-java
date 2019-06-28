package com.bdg.agharibyan.bankaccountsystem.common.type;

import com.bdg.agharibyan.bankaccountsystem.common.exception.InvalidPhoneTypeException;

public enum PhoneType {
    Mobile,
    Work,
    Home;

    public static PhoneType find (String phoneType){
        PhoneType found = null;
         for(PhoneType value:values()){
             if(value.name().equalsIgnoreCase(phoneType)){
                 found = value;
             }
         }
        if(found == null){
            throw new InvalidPhoneTypeException(phoneType);
        }

        return found;
    }
}
