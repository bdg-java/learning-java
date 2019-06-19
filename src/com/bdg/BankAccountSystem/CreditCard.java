package com.bdg.BankAccountSystem;

import java.util.Date;

public class CreditCard extends AbstractBankEntery{
    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType CardType;


    public CreditCard(int id,int accountNumber, Date expirationDate, CardType cardType){
        super(id);
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.CardType = cardType;
    }

    public com.bdg.BankAccountSystem.CardType getCardType() {
        return CardType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardType(com.bdg.BankAccountSystem.CardType cardType) {
        CardType = cardType;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
