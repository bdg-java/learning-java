package com.bdg.bankaccountsystem;

import com.bdg.bankaccountsystem.common.*;
import com.bdg.bankaccountsystem.services.CreditCardCrudService;
import com.bdg.bankaccountsystem.services.CreditCardService;
import com.bdg.bankaccountsystem.storage.creditcard.CreditCardStorage;
import com.bdg.bankaccountsystem.storage.customer.CustomerStorage;
import com.bdg.bankaccountsystem.useful.RandomString;

public class BankAccountSystemApplication {

    public static void main(String[] args) {

        CreditCardService service = new CreditCardCrudService();
        RandomString cardnumber = new RandomString();
        RandomString accountnumber = new RandomString();
//        for (int i = 0; i<10; i++) {
//            service.create(cardnumber.generateRandomCardNumber(16), accountnumber.generateRandomAccountNumber(5), "10-10-2020", "VISA");
//
//        }
//        System.out.println(service.get(2));


        CreditCardStorage storage = new CreditCardStorage(20, 11);

        storage.add(service.create(cardnumber.generateRandomCardNumber(16), accountnumber.generateRandomAccountNumber(5), "10-10-2020", "VISA"));


//        System.out.println(storage.remove(1));
//        System.out.println(storage.get(1));
//        System.out.println(storage.get(1));

        CustomerStorage customerStorage = new CustomerStorage();
        PhoneNumber phoneN = new PhoneNumber(CountryCode.ARM, "123456", PhoneType.MOBILE);
//        Address address = new Address(Country.AM, "St.1","123456");
        Customer customerService = new Customer("Name", "Surname", new Address(Country.AM, "St.1","123456"), 1);

        System.out.println(customerStorage.add(customerService));
        System.out.println(customerStorage);
        System.out.println(customerStorage.remove(20));
        System.out.println(customerStorage);


    }
}
