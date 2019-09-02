package bankaccount;

public class Account {

    private String accountNumber;
    private Customer customer;
    private AccountBalance accountBalance;
    private CreditCard creditCard;

    public Account(String accountNumber, Customer customer, AccountBalance accountBalance, CreditCard creditCard) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.accountBalance = accountBalance;
        this.creditCard = creditCard;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean addAccountBalance(double amount) {
        return accountBalance.addAmount(amount);
    }

    public boolean reduceAccountBalance(double amount) {
        return accountBalance.reduceAmount(amount);
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customer=" + customer +
                ", accountBalance=" + accountBalance +
                ", creditCard=" + creditCard +
                '}';
    }
}
