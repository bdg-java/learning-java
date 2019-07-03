package com.BankAccount.dbo;

import com.BankAccount.common.CardType;

public class CreditCardCreationRequest {
    public String cardNumber;
    public int accountNumber;
    public String expDate;
    public CardType cardType;

    public CreditCardCreationRequest(String cardNumber, int accountNumber, String expDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
    }
}
