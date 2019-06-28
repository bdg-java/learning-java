package com.bdg.agharibyan.bankaccountsystem.entity;

import com.bdg.agharibyan.bankaccountsystem.common.type.CardType;

import java.time.LocalDate;

public final class CreditCard extends AbstractBankEntity {

    private String cardNumber; // random String, find way to generate
    private int accountNumber;
    private LocalDate expirationDate;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNumber, LocalDate expDate, CardType cardType){
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expirationDate = expDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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
    public String toString(){
        return "CreditCard: {" +
                "cardNumber: '" + cardNumber + '\'' +
                ", accountNumber: " + accountNumber +
                ", expirationDate: " + expirationDate +
                ", cardType: " + cardType +
                ", id: " + id +
                ", createdDate: " + createdDate +
                ", updatedDate: " + updatedDate +
                ", deletedDate: " + deletedDate +
                "}";
    }
}
