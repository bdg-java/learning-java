package com.bdg.bankaccountsystem;

import java.time.LocalDate;

public class CreditCard extends BankEntity {
    private String cardNumber;
    private int accountNumber;
    private LocalDate expirationDate;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNumber, LocalDate expirationDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
