package com.bdg.BankSystem;

public enum CardType {

    VISA, MASTERCARD;

    public static CardType find(String cardType) {

        CardType found = null;
        for (CardType value : values()) {
            if (value.name().equalsIgnoreCase(cardType)) {
                found = value;
            }
        }

        if (found == null) {
            throw new InvalidCardTypeException(cardType);
        }
        return found;
    }
}

