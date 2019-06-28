package com.bdg.bankaccountsystem;

import com.bdg.bankaccountsystem.implementation.CreditCardServiceImpl;
import com.bdg.bankaccountsystem.services.CreditCardService;
import com.bdg.bankaccountsystem.storage.creditcard.CreditCardStorage;
import com.bdg.bankaccountsystem.useful.RandomString;

public class BankAccountSystemApplication {

    public static void main(String[] args) {

        CreditCardService service = new CreditCardServiceImpl();
        RandomString generator = new RandomString();
        service.create(generator.generateRandomCardNumber(16), 10, "10-10-2020", "VISA");
//        System.out.println(service.get(1));


        CreditCardStorage storage = new CreditCardStorage();
        System.out.println(storage);
    }
}
