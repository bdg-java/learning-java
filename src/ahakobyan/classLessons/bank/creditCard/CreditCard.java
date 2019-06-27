package ahakobyan.classLessons.bank.creditCard;

import ahakobyan.classLessons.bank.bankSystem.AbstractBankEntity;

import java.time.LocalDate;

public class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private LocalDate expirationDate;
    private CardType cardType;

    public CreditCard(String cardNumber  , int accountNumber, LocalDate expDate, CardType cardType) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.expirationDate = expDate;
        this.cardType = cardType;
        this.createdDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", accountNumber=" + accountNumber +
                ", expDate=" + expirationDate +
                ", cardType=" + cardType +
                ", id=" + id +
                ", created=" + createdDate +
                ", updated=" + updatedDate +
                ", deleted=" + deletedDate +
                '}';

    }
}
