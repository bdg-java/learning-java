package com.bdg.BankAccountCreditCard.Service.CreditCrad;


import com.bdg.BankAccountCreditCard.Storage.Storage;
import com.bdg.BankAccountCreditCard.common.CardType;
import com.bdg.BankAccountCreditCard.common.exception.CreditCardNotFoundException;
import com.bdg.BankAccountCreditCard.entity.CreditCard;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//public class CreditCardCrudService implements CreditCardService {
//    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//    private final Storage creditCardStorage = new CreditCardStorage();
//
//    @Override
//    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) {
//        final LocalDate date = LocalDate.parse(expDate, formatter);
//        final CardType type = CardType.findByName(cardType);
//        final CreditCard creditCard = new CreditCard(cardNumber, accountNumber, date, type);
//        if (creditCardStorage.add(creditCard)) {
//            return creditCard;
//        }
//        return null;
//    }
//
//    public CreditCard get(int id) {
//        AbstractBankEntity card = creditCardStorage.get(id);
//        if (card == null) {
//            throw new CreditCardNotFoundException(id);
//        }
//        return (CreditCard) card;
//    }

