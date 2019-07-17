package com.bdg.New_Bank_Account_System;


import com.bdg.New_Bank_Account_System.Service.CreditCard.CreditCardCrudService;
import com.bdg.New_Bank_Account_System.Service.CreditCard.CreditCardNumberGenerator;
import com.bdg.New_Bank_Account_System.Service.CreditCard.CreditCardService;



public class BankAccountSystem {


    public static void main(String[] args) {
        CreditCardService service = new CreditCardCrudService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        service.create(generator.generate(), 10, "10-10-2020", "VISA");
        System.out.println(service.get(1));

    }
}
