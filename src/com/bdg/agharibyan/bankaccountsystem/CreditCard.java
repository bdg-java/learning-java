package com.bdg.agharibyan.bankaccountsystem;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity{

    private String cardNumber; // random String, find way to generate) -  chem haskanum grvatsy
    private int accountNumber;
    private LocalDate expirationDate;
    private CardType cardType; // enum

    public CreditCard(String cardNumber, int accountNumber, LocalDate expDate, CardType cardType, int id){
        super(id);
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expirationDate = expDate;
        this.cardType = cardType;
        this.createdDate = LocalDate.now();
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
}
