package com.bdg.agharibyan.bankaccountsystem;

import com.bdg.agharibyan.bankaccountsystem.common.type.Country;
import com.bdg.agharibyan.bankaccountsystem.common.type.PhoneType;
import com.bdg.agharibyan.bankaccountsystem.entity.Address;
import com.bdg.agharibyan.bankaccountsystem.entity.PhoneNumber;
import com.bdg.agharibyan.bankaccountsystem.service.creditcard.CreditCardCrudService;
import com.bdg.agharibyan.bankaccountsystem.service.creditcard.CreditCardNumberGenerator;
import com.bdg.agharibyan.bankaccountsystem.service.customer.CustomerCrudService;

public class BankAccountSystem {


    public static void main(String[] args) {
        CreditCardCrudService firstCard = new CreditCardCrudService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        firstCard.create(generator.generate(), 10, "25-06-2019", "VISA");
        System.out.println(firstCard.get(1));

        CreditCardCrudService secondCard = new CreditCardCrudService();
        secondCard.create(generator.generate(), 15, "27-06-2019", "Arca");
        System.out.println(secondCard.get(1));
    //    System.out.println(secondCard.delete(1));



//        CustomerCrudService customerservice = new CustomerCrudService();
//        customerservice.create("first customer Name", "first customer Surname", new Address("AM","North.Avenue", PhoneType.values(<1>));
//        System.out.println(customerservice.get(1));

       // petq e sksem PhoneNumberic hasneem Accountin,
    }
}
