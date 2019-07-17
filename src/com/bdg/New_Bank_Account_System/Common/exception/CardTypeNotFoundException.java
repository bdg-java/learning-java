package com.bdg.New_Bank_Account_System.Common.exception;

public class CardTypeNotFoundException extends RuntimeException {

    private final String DEFAULT_MESSAGE = "Card Type not found with name %s ... ";
    private final String message;

    public CardTypeNotFoundException(String cardName) {
        this.message = String.format(DEFAULT_MESSAGE, cardName);
    }

    public String getMessage() {
        return this.message;
    }
}
