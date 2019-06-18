package com.lesson11;

import java.util.Date;

public class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;

    public CreditCard(int id, int accountNamber, Date expirationDate, CardType cardType) {
        super(id);
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

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public CardType cardType() {
        return this.cardType;
    }

    public void setCardNumber(String cardNamber) {
        this.cardNumber = cardNamber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }


}
