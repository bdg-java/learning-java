package ahakobyan.classLessons.bank.account;

import ahakobyan.classLessons.bank.Customer.Customer;

public interface AccountSaveService {

    void accountSave(Customer customer, AccountDetail detail, AccountBalance balance) ;

}
