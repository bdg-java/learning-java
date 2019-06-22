package com.bdg.bankaccounsystem.creditcard;

import java.time.LocalDate;

public class CreditCard extends AbstractEntity {

    private String cardNumber;
    private int accountNumber;
    private LocalDate expDate;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNumber, LocalDate expDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
        this.created = LocalDate.now();
    }



}
