package com.bdg.bankaccountsystem;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity{

//    RandomString randomString = new RandomString();

    private String cardNumber;
    private String accountNumber;
    private LocalDate expDate;
    private CardType cardType;

    public CreditCard(String accountNumber, LocalDate expDate, CardType cardType, String cardNumber) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
        this.created = LocalDate.now();
    }


    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", accountNumber=" + accountNumber +
                ", expDate=" + expDate +
                ", cardType=" + cardType +
                ", id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                ", deleted=" + deleted +
                '}';
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
}
