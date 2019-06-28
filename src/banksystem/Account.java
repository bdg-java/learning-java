package banksystem;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(int id, Customer customer, AccountDetail accountDetail, AccountBalance accountBalance) {
       this.id = id;
        this.customer = customer;
        this.accountDetail = accountDetail;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }
    public AccountBalance accountBalance() {
        return accountBalance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public void setAcountBalance(AccountBalance acountBalance) {
        this.accountBalance = acountBalance;
    }
}
