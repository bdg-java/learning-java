package banksystem.Service;

import banksystem.CreditCard;

public interface CreditCardService {
    CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType);

    CreditCard get(int id);
}
