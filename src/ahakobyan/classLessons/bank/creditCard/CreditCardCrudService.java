package ahakobyan.classLessons.bank.creditCard;

import ahakobyan.classLessons.bank.bankSystem.AbstractBankEntity;
import ahakobyan.classLessons.bank.bankSystem.Storage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreditCardCrudService implements CreditCardService {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final Storage creditCardStorage = new CreditCardStorage();


    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType) {
        final LocalDate date = LocalDate.parse(expDate, formatter);
        final CardType type = CardType.find(cardType);
        final CreditCard creditCard = new CreditCard(cardNumber,accountNumber,date,type);
        if (creditCardStorage.add(creditCard)) {
            return creditCard;
        }

        return null;
    }

    @Override
    public CreditCard get(int id) {
        AbstractBankEntity card = creditCardStorage.get(id);
        if(card == null) {
            throw new CreditCardNotFoundException(id);
        }
        return (CreditCard) card;
    }
}
