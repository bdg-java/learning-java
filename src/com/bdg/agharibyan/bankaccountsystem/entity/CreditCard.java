package com.bdg.agharibyan.bankaccountsystem.entity;

import com.bdg.agharibyan.bankaccountsystem.common.type.CardType;

import java.time.LocalDate;

public final class CreditCard extends AbstractBankEntity {

    private String cardNumber; // random String, find way to generate
    //private int accountNumber; //pohum em AccountDetailov
    private AccountDetail accountDetail;
    private LocalDate expirationDate;
    private CardType cardType;

    public CreditCard(String cardNumber, AccountDetail accountDetail, LocalDate expDate, CardType cardType){
        this.cardNumber = cardNumber;
        this.accountDetail = accountDetail;
        this.expirationDate = expDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString(){
        return "CreditCard: {" +
                "cardNumber: '" + cardNumber + '\'' +
                ", accountDetail: " + accountDetail +
                ", expirationDate: " + expirationDate +
                ", cardType: " + cardType +
                ", id: " + id +
                ", createdDate: " + createdDate +
                ", updatedDate: " + updatedDate +
                ", deletedDate: " + deletedDate +
                "}";
    }
}
