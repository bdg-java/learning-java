package ahakobyan.classLessons.bank.account;

import ahakobyan.classLessons.bank.Customer.Customer;

public class AccountSaverService implements AccountSaveService {

    private AccountSaveService account = new AccountSaverService();

    @Override
    public void accountSave(Customer customer, AccountDetail detail, AccountBalance balance) {
        account.accountSave(customer, detail, balance);
    }
}
