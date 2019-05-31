package com.lesson7;

public class AccountImplementation {
    public static void main(String[] args) {
        Account a1 = new Account("10001232100", "Contract");
        Account a2 = new Account("37000255656", "Agent", 230);
        System.out.println("Account first  " + a1);
        System.out.println("Account second " + a2);
        System.out.println("Credit method " + a1.credit(20));
        System.out.println("Transfer method " + a1.transfer(a2, -5));

    }

}
