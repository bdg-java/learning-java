package com.bdg.bankaccountsystem;

import java.time.LocalDate;

public class BankAccountApplication {
    public static void main(String[] args)  {
        Country country = Country.AM ;
        PhoneNumber phone = new PhoneNumber(CountryCode.ARM,"123124",PhoneType.Mobile) ;
        Address address = new Address(country,"Duryan",new PhoneNumber[10]);
        Customer customer = new Customer("Полиграф "," Полиграфович",address);

        AccountBalance  balance = new AccountBalance(12000);

        AccountDetail detail = new AccountDetail("Счет собаки");
        Account account = new Account(customer,detail,balance);


        /*System.out.println(country.countryName+" "+country.numericCode+" "
                +customer.getCustomerName()+" "+ customer.getCustomerSurname()+" "
                +address.getStreet()+" "+phone.getNumber());*/
        String card="";
        CreditCardServiceImpl sample= new CreditCardServiceImpl();
        int numb = 0;
        sample.create(card,numb,"25/06/2019","Visa");
        sample.saveBankAccount();
//        System.out.println("account number "+sample.accountNumb()+",card number "+sample.cardNumber()+"");
        for (int i = 0; i <sample.accountList.length ; i++) {
            if (sample.accountList[i] != null) {
                System.out.println(sample.accountList[i].getAccountNumber()+ " " + sample.accountList[i].getCardNumber());
            }
        }

    }
}
