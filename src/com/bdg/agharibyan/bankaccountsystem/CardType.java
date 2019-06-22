package com.bdg.agharibyan.bankaccountsystem;

public enum CardType {
    VISA,
    MasterCard,
    ARCA,
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
