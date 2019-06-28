package com.bdg.bankaccountsystem;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity{

//    RandomString randomString = new RandomString();

    private String cardNumber;
    private int accountNumber;
    private LocalDate expDate;
    private CardType cardType;

    public CreditCard(int accountNumber, LocalDate expDate, CardType cardType, String cardNumber) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
        this.created = LocalDate.now();
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public LocalDate getExpirationDate() {
        return this.expDate;
    }

    public void setExpirationDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
}
