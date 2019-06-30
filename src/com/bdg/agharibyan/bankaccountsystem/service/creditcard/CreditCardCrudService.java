package com.bdg.agharibyan.bankaccountsystem.service.creditcard;

import com.bdg.agharibyan.bankaccountsystem.common.type.CardType;
import com.bdg.agharibyan.bankaccountsystem.common.exception.CreditCardNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.AccountDetail;
import com.bdg.agharibyan.bankaccountsystem.entity.CreditCard;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;
import com.bdg.agharibyan.bankaccountsystem.storage.CreditCardStorage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCardCrudService implements CreditCardService{

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //inchi hamar e sa? stacats amsativy nuyn formati berelu hamar?
    private final Storage creditCardStorage = new CreditCardStorage();

    @Override
    public CreditCard create(String cardNumber, AccountDetail accountDetail, String expDate, String cardType){
        final LocalDate date = LocalDate.parse(expDate, formatter); // chem haskanum inch e anum, taratesak amsatvery berum e nuyn formati?
        final CardType type = CardType.find(cardType);
        final CreditCard creditCard = new CreditCard(cardNumber, accountDetail, date, type);

        if(creditCardStorage.add(creditCard)){
            return creditCard;
        }
        return null;
    }

    @Override
    public CreditCard get(int id){
        AbstractBankEntity card = creditCardStorage.get(id);
        if(card == null){
            throw new CreditCardNotFoundException(id); // menq CreditCardStorage-um arden isk exception gcum enq, imast uni estegh el da anelu?
        }
        return (CreditCard)card;
    }

    @Override
    public CreditCard delete(int id){
        if(creditCardStorage.remove(id)){
            return this.get(id);
        }
        return null;
    }
}
