package com.BankAccount.service.creditcard;

import com.BankAccount.dbo.CreditCardCreationRequest;
import com.BankAccount.entity.CreditCard;
import com.BankAccount.exception.CreditCardNotFoundException;
import com.BankAccount.service.BankAccountBaseService;
import com.BankAccount.storage.MemoryStorage;
import com.BankAccount.storage.Storage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCardService implements BankAccountBaseService<CreditCard, CreditCardCreationRequest> {

    private final Storage<CreditCard> storage = new MemoryStorage<CreditCard>(STORAGE_SIZE);
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public CreditCard create(CreditCardCreationRequest request) {
        CreditCard card = new CreditCard(request.cardNumber, request.accountNumber, LocalDate.parse(request.expDate, formatter), request.cardType);
        return storage.add(card);
    }

    @Override
    public CreditCard get(int id) throws CreditCardNotFoundException {
        CreditCard card = storage.get(id);
        if (card != null)
            return card;
        throw new CreditCardNotFoundException(id);

    }

    @Override
    public CreditCard remove(int id) throws CreditCardNotFoundException {
        CreditCard card = storage.get(id);
        if (card != null) {
            card.setDeleteDate(LocalDate.now());
            return card;
        }
        throw new CreditCardNotFoundException(id);

    }

    @Override
    public CreditCard update(int id, CreditCardCreationRequest request) throws CreditCardNotFoundException {
        CreditCard card = storage.get(id);
        if (card != null) {
            card.setDeleteDate(LocalDate.now());
            return storage.add(new CreditCard(request.cardNumber, request.accountNumber, LocalDate.parse(request.expDate, formatter), request.cardType));
        }
        throw new CreditCardNotFoundException(id);

    }
}