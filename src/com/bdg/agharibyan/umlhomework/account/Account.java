package com.bdg.agharibyan.umlhomework.account;


public class Account {

    private String id;
    private String Name;
    private int balance = 0;

    private int anotherAccountBalance;

    public Account(String id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public Account(String id, String Name, int balance) {
        this.id = id;
        this.Name = Name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        balance = this.balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = this.balance - amount;
        } else {
            System.out.print("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance = this.balance - amount;
            anotherAccountBalance = this.anotherAccountBalance + amount;
        } else {
            System.out.print("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return ("account[id=" + id + ",name=" + Name + ",balance=" + balance + "]");
    }
//toStringum this-er petq e grel? erb grum em, krkin popokhvats balancen e grum(qani vor creditn u debitn ashkhatacnum em), ayd patcharov chem grel.
}
