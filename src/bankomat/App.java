package bankomat;

public class App {
    public static void main(String[] args) {
        ATM atm = new ATM(2, 5, 6);
        atm.getMoney(18000);
        atm.getMoney(20000);
        atm.getMoney(22000);
        atm.getMoney(35000);
        atm.getMoney(3000);
        atm.getMoney(2000);
    }
}
