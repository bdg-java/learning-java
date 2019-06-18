package com.bdg.bankaccountsystem;

import com.bdg.stringoperations.RandomString;

import java.util.Date;

public class CreditCard extends abstractBankEntity {
    private String cardNumber = RandomString.generateRandomString(12);
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;

     CreditCard(int accountNumber,Date expirationDate,
                      CardType cardType,int id
    ){
        super(id);
            this.accountNumber = accountNumber;
            this.expirationDate = expirationDate;
            this.cardType = cardType;
    }

     String getCardNumber() {
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
