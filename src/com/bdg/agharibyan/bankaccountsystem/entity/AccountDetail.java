package com.bdg.agharibyan.bankaccountsystem.entity;

public final class AccountDetail extends AbstractBankEntity { //petq e zharangi AbstractBankEntityic?

    private int accountNumber;
    private CreditCard creditCard; //grum em mek credit card, vorovhetev ardyoq nuyn hashvin kic karogh e tarber carder unenal, te yuraqanchyur nor cardi hamar nor hashiv e bacvum? es andzamb unem erku card, yuraqanchyurn uni arandzin ir unique accounty

    public AccountDetail(int accountNumber, CreditCard creditCard){
        this.accountNumber = accountNumber;
        this.creditCard = creditCard;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public String toString(){
        return "Account Details: {" +
                "Account Number: " + accountNumber +
                "CreditCard: " + creditCard +
                "}";
    }
}
