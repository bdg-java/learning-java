package ahakobyan.classLessons.bank.bankSystem;

import ahakobyan.classLessons.bank.creditCard.CreditCardCrudService;
import ahakobyan.classLessons.bank.creditCard.CreditCardNumberGenerator;
import ahakobyan.classLessons.bank.creditCard.CreditCardService;

public class BankSystem {
    public static void main(String[] args) {

        CreditCardService service = new CreditCardCrudService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        service.create(generator.generate(),15,"15-5-2021", "MASTERCARD");
        System.out.println(service.get(1));
    }
}
