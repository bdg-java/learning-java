package com.bdg.repetition.bankaccount.common;

public enum CardType {
    VISA,
    MASTER,
    ELECTRON;

    public static CardType find(String cardType){
        CardType found = null;
        for(CardType value:values()){
            if(value.name().equalsIgnoreCase(cardType)){
                found = value;
            }
        }
        return found;
    }

}
