package com.bdg.bankaccountsystem.credit_card;

public enum CardType {
    Visa,
    MasterCard,
    AmericanExpress,
    Discover,
    Chase;
    public static CardType find(String cardType){

        CardType found = null;
        for (CardType value:values()) {
            if (value.name().equalsIgnoreCase(cardType)) {
                found = value;
            }
        }
        if (found == null){
            throw new InvalidCardTypeException();
        }
        return found;
    }

}
