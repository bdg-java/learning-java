package com.bdg.classlessons;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return balance;
        }
        return balance + amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return balance - amount;
        }
        System.out.println("Amount exceeded balance");
        return balance;
    }

    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            anotherAccount.balance = amount;
        }
        System.out.println("Amount exceeded balance");
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance+"]";
    }
}
