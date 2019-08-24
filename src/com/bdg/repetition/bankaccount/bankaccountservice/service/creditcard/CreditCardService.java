package com.bdg.repetition.bankaccount.bankaccountservice.service.creditcard;

import com.bdg.repetition.bankaccount.bankaccountservice.common.CardType;
import com.bdg.repetition.bankaccount.bankaccountservice.entity.CreditCard;
import com.bdg.repetition.bankaccount.bankaccountservice.request.CreditCardCreationRequest;
import com.bdg.repetition.bankaccount.bankaccountservice.service.BankAccountService;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.MemoryStorage;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.Storage;

public class CreditCardService implements BankAccountService<CreditCard, CreditCardCreationRequest> {

    private final Storage<CreditCard> storage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        CreditCard creditCard = new CreditCard(CardType.find(request.cardType));
        return storage.add(creditCard);
    }

    @Override
    public CreditCard get(int id) {
        return storage.get(id);
    }

    @Override
    public CreditCard delete(int id) {
        storage.remove(id);
        return storage.get(id);
    }

}
