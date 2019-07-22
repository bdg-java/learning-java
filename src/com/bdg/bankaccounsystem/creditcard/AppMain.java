package com.bdg.bankaccounsystem.creditcard;

public class AppMain {

    public static void main(String[] args) {
        try {
            something();
        } catch (Exception ex) {
            System.out.println("INVALID ADDRESS");
        }
    }

    static void something() throws CreditCardCreationException {
        throw new CreditCardCreationException();
    }
}
