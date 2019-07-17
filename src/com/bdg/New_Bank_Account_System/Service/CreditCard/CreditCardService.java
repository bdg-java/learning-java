package com.bdg.New_Bank_Account_System.Service.CreditCard;

import com.bdg.New_Bank_Account_System.Entity.CreditCard;

public interface CreditCardService {

    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);

    CreditCard get(int id);
}