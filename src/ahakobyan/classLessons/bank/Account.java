package ahakobyan.classLessons.bank;

public class Account extends AbstractBankEntity {

    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(Customer customer, AccountDetail accountDetail, AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
        this.accountDetail = accountDetail;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountBalance getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountDetail getAccountDetail() {
        return this.accountDetail;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }
}
