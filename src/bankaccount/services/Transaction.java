package bankaccount.services;

import bankaccount.Account;

public class Transaction implements TransactionInterface {
    @Override
    public boolean credit(Account accountToCharge, Account accountToAdd, double amount) {
        if (amount > 0) {
            if (accountToCharge.getAccountBalance().getAmount() - amount > 0) {
                if (accountToCharge.reduceAccountBalance(amount)) {
                    accountToAdd.addAccountBalance(amount);
                    return true;
                }
            }
        }
        return false;
    }


}
