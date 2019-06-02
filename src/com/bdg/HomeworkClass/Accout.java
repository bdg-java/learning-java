package com.bdg.HomeworkClass;

public class Accout {
    private String id = "id";
    private String name = "name";
    private int balance = 0;

    public Accout(String aa, String nn){
        this.name = nn;
        this.id = aa;
    }
    public Accout(String nn, String aa, int xx){
        this.id = aa;
        this.name = nn;
        this.balance = xx;
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
       return balance += amount;
    }

    public int debit(int amount){
        if(amount<= balance){
        return balance  -= amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferto( Accout another , int amount ){
        if(amount <= balance ){
            return balance += amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString(){
        return "id:"+ this.id+","+"name:"+ this.name +","+"balance"+ this.balance;
    }



}
