package bankaccount.services;

import bankaccount.Account;

public interface TransactionInterface {
     boolean credit(Account accountToCharge, Account accountToAdd,double amount);
    // boolean deposit(double amount);
}
