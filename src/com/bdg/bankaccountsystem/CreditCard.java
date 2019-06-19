package com.bdg.bankaccountsystem;

public class CreditCard extends AbstractBankEntity{

//    RandomString randomString = new RandomString();

    private String cardNumber = RandomString.generateRandomCardNumber(16);

    int accountNumber;
    private Date expirationDate;
    private CardType cardType;

    CreditCard(int accountNumber, Date expirationDate, CardType cardType, int id) {
        super(id);
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
}
