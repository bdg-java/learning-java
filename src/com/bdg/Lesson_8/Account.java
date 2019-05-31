package com.bdg.Lesson_8;


public class Account {

    private String ID ;
    private String Name;
    private int balance;


    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    public void getBalance() {
        if (balance < 0) {
            System.out.println("Balance error");
        } else System.out.println(balance);;

    }
}