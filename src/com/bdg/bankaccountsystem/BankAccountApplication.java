package com.bdg.bankaccountsystem;

public class BankAccountApplication {
    public static void main(String[] args)  {
        Country country = Country.RU ;
        PhoneNumber phone = new PhoneNumber(CountryCode.RUS,"123124",PhoneType.Mobile) ;
        Address address = new Address(country,"Duryan",new PhoneNumber[10]);
        Customer customer = new Customer("Полиграф "," Полиграфович",address);
        AccountDetail detail = new AccountDetail("Счет собаки");
        AccountBalance  balance = new AccountBalance(12000);
        Account account = new Account(customer,detail,balance);
        System.out.println(country.countryName+" "+country.numericCode+" "+customer.getCustomerName()+" "+ customer.getCustomerSurname()+" "+address.getStreet()+" "+phone.getNumber());

    }
}
