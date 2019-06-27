package ahakobyan.classLessons.bank.account;

import ahakobyan.classLessons.bank.Customer.Customer;
import ahakobyan.classLessons.bank.country.Address;
import ahakobyan.classLessons.bank.country.Country;
import ahakobyan.classLessons.bank.phone.PhoneNumber;

public class AccountCreationService implements AccountCreateService {

        private String name;
        private String surName;
        private String mail;
        private String street;

    @Override
    public Account create(String name, String surName, String mail) {

        this.name = name;
        this.surName = surName;
        this.mail = mail;

        Address address = new Address(Country.AM, street , new PhoneNumber[1]);
        Customer customer = new Customer("Petros", "Petrosyan", address);
        AccountDetail detail = new AccountDetail(name, surName, mail);
        AccountBalance balance = new AccountBalance(89.15);

        if (detail == null || customer == null) {
            throw new AccountCreationException();
        }

        Account account = new Account(customer, detail, balance);
        return account;
    }
}
