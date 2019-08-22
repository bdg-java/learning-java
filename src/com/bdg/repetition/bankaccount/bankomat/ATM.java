package com.bdg.repetition.bankaccount.bankomat;

public class ATM {

    private int fiftybanknotes;
    private int onehundredbanknotes;
    private int fivehundredbanknotes;
    private int onethousandbanknotes;
    private int fivethousandbanknotes;

    private ATM(int fifty, int onehundred, int fivehundred, int onethousand, int fivethousand){
        this.fiftybanknotes = fifty;
        this.onehundredbanknotes = onehundred;
        this.fivehundredbanknotes = fivehundred;
        this.onethousandbanknotes = onethousand;
        this.fivethousandbanknotes = fivethousand;
    }

    public static ATM createATM(int fifty, int onehundred, int fivehundred, int onethousand, int fivethousand){
        if(fifty >= 0 && onehundred >= 0 && fivehundred >= 0 && onethousand >= 0 && fivethousand >= 0){
            return new ATM(fifty, onehundred, fivehundred, onethousand, fivethousand);
        }
        System.out.println("ATM is not creating with negative number of banknotes");
        return null;
    }

    public void balancecheck(){
        System.out.println("There is " +
                + this.fivethousandbanknotes + " five thousand banknotes, " +
                + this.onethousandbanknotes + " one thousand banknotes, " +
                + this.fivehundredbanknotes + " five hundred banknotes, " +
                + this.onehundredbanknotes + " one hundred banknotes, " +
                + this.fiftybanknotes + " fifty banknotes at ATM just now.");
    }

    public void inputmoney(int fifty, int onehundred, int fivehundred, int onethousand, int fivethousand){
        this.fiftybanknotes += fifty;
        this.onehundredbanknotes += onehundred;
        this.fivehundredbanknotes += fivehundred;
        this.onethousandbanknotes += onethousand;
        this.fivethousandbanknotes += fivethousand;
        System.out.println("The inputting money at ATM is finished successfully.");
    }

    private int requestfivethousandbanknotes;
    private int requestonethousandbanknotes;
    private int requestfivehundredbanknotes;
    private int requestonehundredbanknotes;
    private int requestfiftybanknotes;

    private int countnecessarybills(int requestamount){

        if(requestamount/5000 <= this.fivethousandbanknotes){
            requestfivethousandbanknotes = requestamount/5000;
            requestamount -= requestfivethousandbanknotes * 5000;
        } else{
            requestfivethousandbanknotes = this.fivethousandbanknotes;
            requestamount -= this.fivethousandbanknotes * 5000;
        }
        if(requestamount/1000 <= this.onethousandbanknotes){
            requestonethousandbanknotes = requestamount/1000;
            requestamount -= requestonethousandbanknotes * 1000;
        } else{
            requestonethousandbanknotes = this.onethousandbanknotes;
            requestamount -= this.onethousandbanknotes * 1000;
        }
        if(requestamount/500 <= this.fivehundredbanknotes){
            requestfivehundredbanknotes = requestamount/500;
            requestamount -= requestfivehundredbanknotes * 500;
        } else{
            requestfivehundredbanknotes = this.fivehundredbanknotes;
            requestamount -= this.fivehundredbanknotes * 500;
        }
        if(requestamount/100 <= this.onehundredbanknotes){
            requestonehundredbanknotes = requestamount/100;
            requestamount -= requestonehundredbanknotes * 100;
        } else{
            requestonehundredbanknotes = this.onehundredbanknotes;
            requestamount -= this.onehundredbanknotes * 100;
        }
        if(requestamount/50 <= this.fiftybanknotes){
            requestfiftybanknotes = requestamount/50;
            requestamount -= requestfiftybanknotes * 50;
        } else{
            requestfiftybanknotes = this.fiftybanknotes;
            requestamount -= this.fiftybanknotes * 50;
        }
        return requestamount;
    }

    private boolean ispossiblegetmoney(int requestamount){
        return(this.countnecessarybills(requestamount) == 0);
    }

    public void getmoney(int requestamount){
        if (this.ispossiblegetmoney(requestamount)){
            System.out.println(requestamount + " AMD were issued with " +
                    + requestfivethousandbanknotes + " five thousand banknotes, " +
                    + requestonethousandbanknotes + " one thousand banknotes, " +
                    + requestfivehundredbanknotes + " five hundred banknotes, " +
                    + requestonehundredbanknotes + " one hundred banknotes, " +
                    + requestfiftybanknotes + " fifty banknotes.");
            this.refreshATMaftergettingmoney();
        } else{
            System.out.println("The ATM cannot issued entered amount.");
        }
    }

    private void refreshATMaftergettingmoney(){
        this.fiftybanknotes -= requestfiftybanknotes;
        this.onehundredbanknotes -= requestonehundredbanknotes;
        this.fivehundredbanknotes -= requestfivehundredbanknotes;
        this.onethousandbanknotes -= requestonethousandbanknotes;
        this.fivethousandbanknotes -= requestfivethousandbanknotes;
    }

    //chei cankana mi classum esqan method mna, vor S-y pahpanver, bayc... zato ashkhhatum a :)

}
