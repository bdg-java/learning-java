package com.bdg.agharibyan.bankaccountsystem.service.creditcard;

import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;

public interface CreditCardService {

    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);

    CreditCard get(int id);
}
