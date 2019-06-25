package com.bdg.agharibyan.bankaccountsystem.common.type;

import com.bdg.agharibyan.bankaccountsystem.common.exception.InvalidCardTypeException;

public enum CardType {
    VISA,
    MASTERCARD,
    ARCA, //inchu e yndgtsum taky?
    AmericanExpress;


    public static CardType find (String cardType){

        CardType found = null;
        for(CardType value: values()){
            if(value.name().equalsIgnoreCase(cardType)){
                found = value;
            }
        }

        if (found == null){
            throw new InvalidCardTypeException(cardType);
        }

        return found;
    }
}
