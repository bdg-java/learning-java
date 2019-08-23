package com.bdg.bankaccountsystem.credit_card;

public interface CreditCardService {
    CreditCard create(String cardNumber ,int accountNumber , String expDate ,String cardType);
}
