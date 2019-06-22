package com.bdg.agharibyan.bankaccountsystem;

public interface CreditCardService {

    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType, int id);

}
