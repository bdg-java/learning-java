package com.bdg.classes;

public class Account_Test {
    public static void main(String[] args) {
        Account account = new Account("6643090","services");
        Account account1 = new Account("122334","CarWash",300);
        account.credit(12000);
        System.out.println("account balance is "+account.getBalance());
        account.debit(140);
        System.out.println("account balance is "+account.getBalance());
        account.transferTo(account1,600);
        System.out.println("account 1 balance is "+account1.getBalance());
        System.out.println("account balance is "+account.getBalance());
    }
}
