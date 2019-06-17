package ahakobyan.ClassLessons;

public class Account {

    private String id;
    private String name;
    private int balance;

    public void Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void Account(String id, String name, int balance ){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        if (balance < 0) {
            System.out.println("Balance ERROR");
        } else System.out.println(balance);
        return this.balance;
    }

    public int credit(int amount) {
        this.balance = amount + balance;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return this.balance;
        }
        System.out.println("Amount exceeded balance");
        return this.balance;
    }

    public int transferTo(Account account, int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            account.credit(amount);
            return this.balance;
        }
        System.out.println("Amount exceeded balance");
        return this.balance;
    }

    public String toString() {
        return "Acoount[id: "+ this.id +", name: "+ this.name +", balnance: "+ this.balance +"]";
    }
}
