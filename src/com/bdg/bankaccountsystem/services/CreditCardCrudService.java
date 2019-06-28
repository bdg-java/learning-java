package com.bdg.bankaccountsystem.services;

import com.bdg.bankaccountsystem.AbstractBankEntity;
import com.bdg.bankaccountsystem.CardType;
import com.bdg.bankaccountsystem.CreditCard;
import com.bdg.bankaccountsystem.exceptions.CreditCardNotFoundException;
import com.bdg.bankaccountsystem.storage.Storage;
import com.bdg.bankaccountsystem.storage.creditcard.CreditCardStorage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCardCrudService implements CreditCardService {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final Storage creditCardStorage = new CreditCardStorage();


    @Override
    public CreditCard create(String cardNumber, String accountNumber, String expDate, String cardType) {
        final LocalDate date = LocalDate.parse(expDate, formatter);
        final CardType type = CardType.findByName(cardType);
        final CreditCard creditCard = new CreditCard(accountNumber, date, type, cardNumber);
        if (creditCardStorage.add(creditCard)) {
            return creditCard;
        }
        return null;
    }

    @Override
    public CreditCard get(int id) {
        AbstractBankEntity card = creditCardStorage.get(id);
        if (card == null) {
            throw new CreditCardNotFoundException(id);
        }
        return (CreditCard) card;
    }

//    public static void main(String[] args) {
//        RandomString number = new RandomString();
//        CreditCard c = new CreditCard(10, LocalDate.now(), CardType.VISA, number.generateRandomCardNumber(16));
//        CreditCard c1 = new CreditCard(11, LocalDate.now(), CardType.MASTERCARD, number.generateRandomCardNumber(16));
//        System.out.println(c.getCreated());
//        c1.setId(0);
//        System.out.println(c1);
//
//    }
}
