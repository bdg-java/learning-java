package com.bdg.agharibyan.bankaccountsystem.service.creditcard;

import com.bdg.agharibyan.bankaccountsystem.entity.AccountDetail;
import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;

public interface CreditCardService {

    CreditCard create(String cardNumber, AccountDetail accountDetail, String expDate, String cardType);

    CreditCard get(int id);

    CreditCard delete(int id);
}
