package com.bdg.bankaccounsystem.creditcard;

import java.time.LocalDate;

public class CreditCardServiceImpl implements CreditCardService {

    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) throws CreditCardCreationException  {

        LocalDate exp = LocalDate.parse(expDate);
        CardType type = CardType.find(cardType);

        if (type == null) {
            throw new CreditCardCreationException();
        }

        CreditCard card = new CreditCard(cardNumber, accountNumber, exp, type);
        return card;
    }
}
