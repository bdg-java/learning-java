package com.bdg.bank;

import java.util.Date;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber;
    private int accountNuber;
    private Date expirationDate;
    private CardType cardType;
    CreditCard(int accountNuber,Date expirationDate,CardType cardType,int id){
        super(id);
        this.accountNuber = accountNuber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;

    }

}
