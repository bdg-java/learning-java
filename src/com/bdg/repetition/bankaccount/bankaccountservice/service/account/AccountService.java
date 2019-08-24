package com.bdg.repetition.bankaccount.bankaccountservice.service.account;

import com.bdg.repetition.bankaccount.bankaccountservice.common.CardType;
import com.bdg.repetition.bankaccount.bankaccountservice.common.Country;
import com.bdg.repetition.bankaccount.bankaccountservice.entity.*;
import com.bdg.repetition.bankaccount.bankaccountservice.request.AccountCreationRequest;
import com.bdg.repetition.bankaccount.bankaccountservice.request.CreditCardCreationRequest;
import com.bdg.repetition.bankaccount.bankaccountservice.request.CustomerCreationRequest;
import com.bdg.repetition.bankaccount.bankaccountservice.service.BankAccountService;
import com.bdg.repetition.bankaccount.bankaccountservice.service.creditcard.CreditCardService;
import com.bdg.repetition.bankaccount.bankaccountservice.service.customer.CustomerService;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.MemoryStorage;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.Storage;

public class AccountService implements BankAccountService<Account, AccountCreationRequest> {

    private final Storage<Account> storage = new MemoryStorage<>(STORAGE_SIZE);
    private final BankAccountService<Customer, CustomerCreationRequest> customerService = new CustomerService();
    private final BankAccountService<CreditCard, CreditCardCreationRequest> creditCardService = new CreditCardService();

    @Override
    public Account create(AccountCreationRequest request) {
        Address address1 = new Address(Country.findByName(request.customerCreationRequest.addressCreationRequest.countryName), request.customerCreationRequest.addressCreationRequest.cityName, request.customerCreationRequest.addressCreationRequest.street, request.customerCreationRequest.addressCreationRequest.homeNumber, request.customerCreationRequest.addressCreationRequest.phoneNumber);
        Customer customer1 = new Customer(request.customerCreationRequest.firstName, request.customerCreationRequest.lastName, address1);
        Customer customer2 = customerService.create(request.customerCreationRequest);
        CreditCard creditCard1 = new CreditCard(CardType.find(request.customerCreationRequest.addressCreationRequest.countryName));
        CreditCard creditCard2 = creditCardService.create(request.creditCardCreationRequest);
        Account account1 = new Account(customer1,creditCard1,request.accountBalanceCreationRequest.accountBalance);
        Account account2 = new Account(customer2,creditCard2,request.accountBalanceCreationRequest.accountBalance);
        return storage.add(account1);
//        return storage.add(account2);  - ok e erku tarberakn el?
    }

    @Override
    public Account get(int id) {
        return storage.get(id);
    }

    @Override
    public Account delete(int id) {
        storage.remove(id);
        return storage.get(id);
    }

}
