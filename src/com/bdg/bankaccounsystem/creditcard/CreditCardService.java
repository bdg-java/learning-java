package com.bdg.bankaccounsystem.creditcard;

public interface CreditCardService {

    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) throws CreditCardCreationException;
}
