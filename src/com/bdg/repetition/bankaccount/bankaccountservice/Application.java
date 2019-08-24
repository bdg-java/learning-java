package com.bdg.repetition.bankaccount.bankaccountservice;

import com.bdg.repetition.bankaccount.bankaccountservice.common.CardType;
import com.bdg.repetition.bankaccount.bankaccountservice.common.Country;
import com.bdg.repetition.bankaccount.bankaccountservice.entity.*;

public class Application {

    public static void main(String[] args) {

        Address address1 = new Address(Country.ARM, "Yerevan", "Abovyan", 5, "+37455555555");
        Customer customer1 = new Customer("Poghos", "Poghosyan", address1);
        CreditCard creditCard1 = new CreditCard(CardType.VISA);
        Account account1 = new Account(customer1,creditCard1,0);

        Address address2 = new Address(Country.RU, "Moscow", "Derzhavskaya", 15, "+75555555555");
        Customer customer2 = new Customer("Poghos", "Poghosyan", address2);
        CreditCard creditCard2 = new CreditCard(CardType.VISA);
        Account account2 = new Account(customer2,creditCard2,100000);


    }

}
