package com.BankAccount;

import com.BankAccount.common.CardType;
import com.BankAccount.common.Country;
import com.BankAccount.common.CountryCode;
import com.BankAccount.common.PhoneType;
import com.BankAccount.dbo.CreditCardCreationRequest;
import com.BankAccount.entity.AbstractBankEntity;
import com.BankAccount.entity.CreditCard;
import com.BankAccount.entity.CreditCardNumberGenerator;
import com.BankAccount.entity.PhoneNumber;
import com.BankAccount.exception.BankAccountException;
import com.BankAccount.exception.CreditCardNotFoundException;
import com.BankAccount.exception.FileStorageWriteException;
import com.BankAccount.service.address.AddressService;
import com.BankAccount.service.creditcard.CreditCardService;
import com.BankAccount.storage.FileStorage;
import com.BankAccount.storage.Storage;

import java.io.IOException;

public class BankApplication {
    public static void main(String[] args) {


        CreditCardService cardservice = new CreditCardService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        cardservice.create(new CreditCardCreationRequest(generator.generate(), 1, "02-05-2019", CardType.ARCA));
        cardservice.create(new CreditCardCreationRequest(generator.generate(), 2, "02-06-2019", CardType.MASTER));
        try {
            FileStorage<CreditCard> storage = new FileStorage<CreditCard>("BankAccount", "CreditCardStorage", "txt");
            storage.getFileStorage("BankAccount", "CreditCardStorage", "txt");
            System.out.println(cardservice.get(1));
            System.out.println(cardservice.get(2));
            storage.add(cardservice.get(1));
            storage.add(cardservice.get(2));
            storage.remove(2);
        } catch (IOException | BankAccountException ex) {
            System.out.println(ex.getMessage());
        }



    }
}
