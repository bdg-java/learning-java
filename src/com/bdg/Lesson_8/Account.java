package com.bdg.Lesson_8;


public class Account {

    private String id; //<- field should be camel case
    private String name; //Fields should starts from lower case
    private int balance;


    //Missing constructors

    public Account(String id, String name) {
//        this.id = id;
//        this.name = name;
        //We can use another constructor here :)
        this(id, name, 0);
    }

    //And second constructor with balance as parameter

    public Account(String id, String name, int balance) {
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

    public int getBalance() {  //<--- Balance is int type so method should return integer not a void
//        if (balance < 0) { //<- getter so it just return balance value, also we can check balance before object creation :)
//            System.out.println("Balance error");
//        } else System.out.println(balance);;

        return this.balance;
    }

    public int credit(int amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount < this.balance) {
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
        return "Account [ id : " + this.id + ", name : " + this.name + ", balance : " + this.balance + " ]";
    }
}