package banksystem;

import classlessons.Date;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;

    public CreditCard(int id, int accountNamber, Date expirationDate, CardType cardType) {
        super(id);
        this.accountNumber = accountNamber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}