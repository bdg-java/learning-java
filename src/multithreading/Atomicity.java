package multithreading;

class BrokenBankAccount {
    private int balance;

    synchronized int getBalance() {
        return balance;
    }

    synchronized void setBalance(int x)
            throws IllegalStateException {
        balance = x;
        if (balance < 0) {
            throw new IllegalStateException("Negative Balance");
        }
    }

    void deposit(int x) {
        int b = getBalance();
        setBalance(b + x);
    }

    void withdraw(int x) {
        int b = getBalance();
        setBalance(b - x);
    }

    public static void main(String[] args) {
        BrokenBankAccount bankAccount = new BrokenBankAccount();
        bankAccount.deposit(6);
        bankAccount.withdraw(3);
        System.out.println(bankAccount.balance);
    }
}
