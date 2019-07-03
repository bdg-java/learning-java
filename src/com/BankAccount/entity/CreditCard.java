package com.BankAccount.entity;

import com.BankAccount.common.CardType;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private LocalDate expirationDate;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNamber, LocalDate expirationDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNamber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public void setCardNumber(String cardNamber) {
        this.cardNumber = cardNamber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", accountNumber=" + accountNumber +
                ", expDate=" + expirationDate +
                ", cardType=" + cardType +
                ", id=" + id +
                ", created=" + creditDate +
                ", updated=" + updateDate +
                ", deleted=" + deleteDate +
                '}';
    }


}
