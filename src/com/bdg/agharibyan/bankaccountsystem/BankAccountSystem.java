package com.bdg.agharibyan.bankaccountsystem;

import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;
import com.bdg.agharibyan.bankaccountsystem.service.creditcard.CreditCardCrudService;
import com.bdg.agharibyan.bankaccountsystem.service.creditcard.CreditCardNumberGenerator;

public class BankAccountSystem {

    public static void main(String[] args) {
        CreditCardCrudService service = new CreditCardCrudService(); // dzakh masum chisht em che type grel CreditCardCrudService ?
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        service.create(generator.generate(), 10, "25-06-2019", "VISA");
        System.out.println(service.get(1));
    }
}
