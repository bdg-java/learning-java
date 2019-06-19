package com.bdg.bankaccountsystem;

public class BankAccountApplication {
    public static void main(String[] args) {
        Country country = Country.RU ;
//        Address address = new Address(country,"Duryan",);
//        Customer customer = new Customer("Полиграф "," Полиграфович",address);
        AccountDetail detail = new AccountDetail("Счет собаки");
        AccountBalance  balance = new AccountBalance(12000);
//        Account account = new Account(customer,detail,balance);
        System.out.println(country.countryName+" ");

    }
}
