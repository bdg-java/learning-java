package com.BankAccount.common;

import com.BankAccount.exception.CardTypeNotFoundException;

public enum CardType {
    VISA,
    MASTER,
    ARCA;

    public static CardType findByName(String name) {
        CardType found = null;

        for (CardType value : values()) {
            if (value.name().equalsIgnoreCase(name)) {
                found = value;
            }
        }
        if (found == null)
            throw new CardTypeNotFoundException(name);
        return found;
    }
}
