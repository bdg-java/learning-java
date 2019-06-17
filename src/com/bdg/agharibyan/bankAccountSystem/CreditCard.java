package com.bdg.agharibyan.bankAccountSystem;

public class CreditCard extends AbstractBankEntity{

    private String cardNumber; // random String, find way to generate) -  chem haskanum grvatsu
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType; // enum

    public CreditCard(int accountNumber, Date expDate, CardType cardType, int id){
        super(id);
        this.accountNumber = accountNumber;
        this.expirationDate = expDate;
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
