package ahakobyan.classLessons.bank.account;

import ahakobyan.classLessons.bank.Customer.Customer;
import ahakobyan.classLessons.bank.bankSystem.Storage;
import ahakobyan.classLessons.bank.country.Address;
import ahakobyan.classLessons.bank.country.Country;
import ahakobyan.classLessons.bank.phone.PhoneNumber;

public class AccountCrudService implements AccountSaveService, AccountCreateService {

    private Address address = new Address(Country.AM,"Baxramyan",new PhoneNumber[10]);
    private Customer customer = new Customer("Petros", "Petrosyan", address);
    private AccountDetail detail = new AccountDetail("Axas", "Axasyan", "@com");
    private AccountBalance balance = new AccountBalance(1500.50);
    private Storage accountsStorage = new AccountStorage();

    @Override
    public Account create(String name, String surName, String mail) {
        final Account account = new Account(customer, detail, balance);
        if (accountsStorage.add(account)) {
            return account;
        }
        return null;
    }

    @Override
    public void accountSave(Customer customer, AccountDetail detail, AccountBalance balance) {
        AccountSaveService account = new AccountSaverService();
        account.accountSave(customer, detail, balance);
    }
}
