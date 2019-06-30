package com.bdg.agharibyan.bankaccountsystem;

import com.bdg.agharibyan.bankaccountsystem.common.type.Country;
import com.bdg.agharibyan.bankaccountsystem.common.type.CountryCode;
import com.bdg.agharibyan.bankaccountsystem.common.type.PhoneType;
import com.bdg.agharibyan.bankaccountsystem.entity.*;
import com.bdg.agharibyan.bankaccountsystem.service.creditcard.CreditCardCrudService;
import com.bdg.agharibyan.bankaccountsystem.service.creditcard.CreditCardNumberGenerator;
import com.bdg.agharibyan.bankaccountsystem.service.creditcard.CreditCardService;

import java.util.Arrays;

public class BankAccountSystem {


    public static void main(String[] args) {

        PhoneNumber myWorkPhoneNumber = new PhoneNumber(CountryCode.ARM, "95987861", PhoneType.Work);
        PhoneNumber myMobilePhoneNumber = new PhoneNumber(CountryCode.ARM, "95988861", PhoneType.Mobile);
        PhoneNumber[] myPhoneNumbers = new PhoneNumber[2];
        myPhoneNumbers[0] = myWorkPhoneNumber;
        myPhoneNumbers[1] = myMobilePhoneNumber;
        System.out.println(myWorkPhoneNumber); // kcankanam tpi voch te ARM, ayl +374, aysinqn` enumi arajin fieldy

        Address myAddress = new Address(Country.AM, "Kajaznunu", myPhoneNumbers);
        System.out.println(myAddress);
        System.out.println(myAddress.getCountry());
        System.out.println(myAddress.getStreet());
        System.out.println("MyPhoneNumbers: " + Arrays.toString(myAddress.getPhoneNumber()));

        Customer myCustomer = new Customer("Ani", "Gharibyan", myAddress);
        System.out.println(myCustomer);
        System.out.println(myCustomer.getCustomerName());
        System.out.println(myCustomer.getCustomerSurname());
        System.out.println(myCustomer.getCustomerAddress());

        AccountBalance myAccountBalance = new AccountBalance(0);
        System.out.println(myAccountBalance);
        System.out.println(myAccountBalance.getAccountBalance());


//        commentum em, qani vor chem jokum creditCardy vonc lini AccountDetaili mej, isk AccountDetaily` CreditCardi.`

//        AccountDetail myAccountDetail = new AccountDetail(123, myCreditCard);
//
//
//        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
//        CreditCardService myCreditCard = new CreditCardCrudService();
//        myCreditCard.create(generator.generate(), myAccountDetail, "10-10-2020", "VISA");
//        System.out.println(myCreditCard.get(1));



    }
}
