package bankaccount;

import java.util.Date;

public class CreditCard {
    private String cardNumber;
    private CreditCardType creditCardType;
    private Date expDate;

    public CreditCard(String cardNumber, CreditCardType creditCardType, Date expDate) {
        this.cardNumber = cardNumber;
        this.creditCardType = creditCardType;
        this.expDate = expDate;
    }
}
