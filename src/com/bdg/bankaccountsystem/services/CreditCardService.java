package com.bdg.bankaccountsystem.services;


import com.bdg.bankaccountsystem.CreditCard;

public interface CreditCardService {

    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);

    CreditCard get(int id);

}
