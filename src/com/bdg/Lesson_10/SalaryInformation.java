package com.bdg.Lesson_10;

public class SalaryInformation {
    private String cardNumber;
    private int salary;

    public SalaryInformation (String cardNumber, int salary) {
        this.cardNumber = cardNumber;
        this.salary = salary;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getSalary() {
        return this.salary;
    }
}
