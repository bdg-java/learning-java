package com.bdg.Bank_Account_System;

import java.util.Date;

public class CreditCard extends AbstractBankEntity {

    private int[] cardNumber = IntegerArrayoperations.generateArrayWithRandomNumbers(4);
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;

    public CreditCard(int id,int[] cardNumber, int accountNumber, Date expirationDate, CardType cardType) {
        super(id);
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public int[] getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int[] cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
