package com.bdg.bankaccountsystem;

import java.util.Date;

public class BankAccountApplication {


    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber(CountryPhoneCode.AM,"07746573",PhoneType.PHONE);
        Address address = new Address(Country.AM,"Street n2",phoneNumber);
        Customer customer = new Customer("araqs","shahbazyan",address,3);
        AccountBalance accountBalance = new AccountBalance(200000);
        AccountDetail accountDetail = new AccountDetail("USD");
        Account account = new Account(customer,accountBalance,accountDetail,2);
        CreditCard creditCard = new CreditCard(12, new Date(),CardType.MASTER_CARD,3);
        //System.out.println(account.getAccountDetail());
        System.out.println(creditCard.getCardNumber());
    }


}
