package com.bdg.BankAccountCreditCard.Service.CreditCrad;

import com.bdg.BankAccountCreditCard.entity.CreditCard;

public interface CreditCardService {

    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);

    CreditCard get(int id);
}

