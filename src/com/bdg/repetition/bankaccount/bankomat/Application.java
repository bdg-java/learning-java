package com.bdg.repetition.bankaccount.bankomat;

public class Application {

    public static void main(String[] args) {

        ATM newATM = ATM.createATM(0,0,0,0,0);

        newATM.inputmoney(100,80,60,40, 20);
        newATM.balancecheck();
        newATM.getmoney(101150);
        newATM.balancecheck();
        newATM.getmoney(5050);
        newATM.balancecheck();
        newATM.getmoney(55);
        newATM.balancecheck();
        newATM.getmoney(34000);
        newATM.balancecheck();
        newATM.inputmoney(2,1,0,40,20);
        newATM.balancecheck();
    }

}
