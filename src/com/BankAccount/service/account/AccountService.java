package com.BankAccount.service.account;

import com.BankAccount.dbo.AccountRequest;
import com.BankAccount.dbo.CustomerRequest;
import com.BankAccount.entity.Account;
import com.BankAccount.entity.Customer;
import com.BankAccount.exception.AccountNotFoundException;
import com.BankAccount.service.BankAccountBaseService;
import com.BankAccount.service.customer.CustomerService;
import com.BankAccount.storage.MemoryStorage;
import com.BankAccount.storage.Storage;

import java.time.LocalDate;


public class AccountService implements BankAccountBaseService<Account, AccountRequest> {

    private final static Storage<Account> storage = new MemoryStorage<Account>(STORAGE_SIZE);
    private final BankAccountBaseService<Customer, CustomerRequest> customerService = new CustomerService();

    @Override
    public Account create(AccountRequest request) {
        return storage.add(new Account(customerService.create(request.customerRequest), request.accountDetails, request.accountBalance));

    }

    @Override
    public Account get(int id) throws AccountNotFoundException {
        Account account = storage.get(id);
        if (account != null)
            return account;
        throw new AccountNotFoundException(id);
    }

    @Override
    public Account remove(int id) throws AccountNotFoundException {
        Account account = storage.get(id);
        if (account != null) {
            account.setDeleteDate(LocalDate.now());
            return account;
        }
        throw new AccountNotFoundException(id);
    }

    @Override
    public Account update(int id, AccountRequest request) throws AccountNotFoundException {
        Account account = storage.get(id);
        if (account != null) {
            account.setDeleteDate(LocalDate.now());
            return storage.add(new Account(customerService.create(request.customerRequest), request.accountDetails, request.accountBalance));
        }
        throw new AccountNotFoundException(id);
    }
}
