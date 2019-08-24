package com.bdg.repetition.bankaccount.bankaccountservice.entity;

import com.bdg.repetition.bankaccount.bankaccountservice.common.CardType;

public class CreditCard extends AbstractBankEntity {

    private CardType cardType;

    public CreditCard(CardType cardType){
        this.cardType = cardType;
    }
}
