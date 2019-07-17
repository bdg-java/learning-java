package com.bdg.New_Bank_Account_System.Entity;

import com.bdg.New_Bank_Account_System.Common.CardType;

import java.time.LocalDate;


public final class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private LocalDate expDate;
    private CardType cardType;

    public CreditCard(String cardNumber, int accountNumber, LocalDate expDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
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
}