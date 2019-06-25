package com.bdg.agharibyan.bankaccountsystem.service.creditcard;

import com.bdg.agharibyan.bankaccountsystem.common.type.CardType;
import com.bdg.agharibyan.bankaccountsystem.common.exception.CreditCardNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;
import com.bdg.agharibyan.bankaccountsystem.storage.creditcard.CreditCardStorage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCardCrudService implements CreditCardService{

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //inchi hamar e sa?
    private final Storage creditCardStorage = new CreditCardStorage();

    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType){
        final LocalDate date = LocalDate.parse(expDate, formatter); // chem haskanum inch e anum, taratesak amsatvery berum e nuyn formati?
        final CardType type = CardType.find(cardType);
        final CreditCard creditCard = new CreditCard(cardNumber, accountNumber, date, type);

        if(creditCardStorage.add(creditCard)){
            return creditCard;
        }
        return null;
    }

    @Override
    public CreditCard get(int id){
        AbstractBankEntity card = creditCardStorage.get(id);
        if(card == null){
            throw new CreditCardNotFoundException(id);
        }
        return (CreditCard)card;
    }
}
