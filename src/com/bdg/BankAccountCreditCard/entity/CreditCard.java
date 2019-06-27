package com.bdg.BankAccountCreditCard.entity;


import com.bdg.BankAccountCreditCard.common.CardType;

import java.time.LocalDate;
import java.util.Date;

public class CreditCard extends AbstractBankEntery{
    private String cardNumber;
    private int accountNumber;
    private LocalDate expDate;
    private CardType cardType;


    public CreditCard(String cardNumber, int accountNumber, LocalDate expDate, CardType cardType){

        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expDate = expDate;
        this.cardType = cardType;
    }

    public String toString(){

        return "CreditCard{"+
                "cardNumber" + cardNumber +
                 "accountNumber" + accountNumber +
                "expDate" + expDate +
                "cardType" + cardType +
                "id" + id +
                "created date" + expDate +
                "update" + updated +
                "deleted" + deleted +
                "}";

    }
}
