package com.bdg.bankaccountsystem;

import com.bdg.bankaccountsystem.exceptions.CardTypeNotFoundException;

public enum CardType {
    MASTERCARD,
    VISA,
    AMERICAN_EXPRESS;

    public static CardType findByName(String cardName) {
        CardType found = null;

        for (CardType value : values()) {
            if (value.name().equalsIgnoreCase(cardName)) {
                found = value;
            }
        }
        if (found == null) {
            throw new CardTypeNotFoundException(cardName);
        }
        return found;
    }
}


