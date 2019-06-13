package hr;

public class SalaryInfo {
    private String cardNumber;
    private int salary;

    public SalaryInfo(String cardNumber, int salary) {
        this.cardNumber = cardNumber;
        this.salary = salary;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;

    }
}
