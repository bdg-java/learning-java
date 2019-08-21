package bankomat;

public enum BanknoteEnum {

    TEN_THOUSAND(10000),
    FIVE_THOUSAND(5000),
    THOUSAND(1000);
    private int amount;
    BanknoteEnum(int amount){
        this.amount =amount;
    }

    public int getAmount() {
        return amount;
    }
}
