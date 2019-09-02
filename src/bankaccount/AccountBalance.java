package bankaccount;

public class AccountBalance {

    private double amount;

    public AccountBalance(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean addAmount(double amount){
        System.out.println("amount "+amount);
        if(amount>0){

            this.amount = this.amount+amount;
            System.out.println("this amount "+this.amount);
            return true;
        }
            return false;
    }

    public boolean reduceAmount(double amount){
        System.out.println("reduce amount "+amount);
        if(amount>0){
            this.amount = this.amount-amount;
            System.out.println(" reduce this amount "+this.amount);
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "AccountBalance{" +
                "amount=" + amount +
                '}';
    }
}
