package com.bdg.Homework.Bankomat;

public class Test {
    public static void main(String[] args) {
        ATM atm = new ATM(15, 5, 5);
        atm.getMoney(16000);
        atm.getMoney(45000);
        atm.getMoney(21000);

    }

}
