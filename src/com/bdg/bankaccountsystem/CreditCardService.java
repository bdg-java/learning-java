package com.bdg.bankaccountsystem;

public interface CreditCardService {
    CreditCard create(String cardNumber ,int accountNumber , String expDate ,String cardType);
}
