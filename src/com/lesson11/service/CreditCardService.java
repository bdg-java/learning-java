package com.lesson11.service;

import com.lesson11.entity.CreditCard;
import com.lesson11.exception.CreditCardNotFoundException;

public interface CreditCardService {
    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);

    CreditCard get(int id);

    boolean remove(int id);


}
