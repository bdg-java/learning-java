package com.bdg.BankSystem;


public interface  CreditCardService {
    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);
}
