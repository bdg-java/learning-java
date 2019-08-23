package com.bdg.bankaccountsystem;

public interface Transactions {
    void cashIn(int amount);
    void cashOut(int amount);
    void moneyOrder(String account);
    void bankInterest();
    void cardBalance();
}
