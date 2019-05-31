package com.bdg.lessonclasses;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int credit(int amount) {
       return this.balance += amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account account, int amount) {
        if (amount <= balance) {
           this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String toString() {
        return "Account[id: " + this.id + ", balance: " + this.balance + ", name: " + this.name + "]";
    }


    public static void main(String[] args) {
        Account acc = new Account("1000000155", "Jack", 50);
        Account acc1 = new Account("1000000111", "John", 0);
        System.out.println(acc);
//        System.out.println(acc.credit(10));
//        System.out.println(acc.debit(10));
        System.out.println(acc.transferTo(acc1, 5));
    }

}
