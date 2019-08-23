package com.bdg.bankaccountsystem.account_info;

import com.bdg.bankaccountsystem.credit_card.CreditCard;
import com.bdg.bankaccountsystem.credit_card.CreditCardService;

public class AccountBalance implements CreditCardService {
    private int balance;


    public AccountBalance(int balance)   {
        this.balance = balance;
    }

    public int getBalance()   {
        return balance;
    }

    public void setBalance(int balance)   {
        this.balance = balance;
    }

    @Override
    public CreditCard create(String cardNumber, int accountNumber, String expDate, String cardType)  {
        return null;
    }
}
