package com.bdg.repetition.bankaccount.bankomat;

public class Application {

    public static void main(String[] args) {

        //my solution
        ATM newATM = ATM.createATM(0,0,0,0,0);

        newATM.inputmoney(100,80,60,40,20);
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

        System.out.println();

        //true solution with many classes without getmoney method
        FiftyBanknote fifty = new FiftyBanknote();
        CountedBanknote<FiftyBanknote> fiftyBanknoteCountedBanknote = new CountedBanknote<>(100,fifty);
        OneHundredBanknote oneHundred = new OneHundredBanknote();
        CountedBanknote<OneHundredBanknote> oneHundredBanknoteCountedBanknote = new CountedBanknote<>(80,oneHundred);
        FiveHundredBanknote fiveHundred = new FiveHundredBanknote();
        CountedBanknote<FiveHundredBanknote> fiveHundredBanknoteCountedBanknote = new CountedBanknote<>(60,fiveHundred);
        OneThousandBanknote oneThousandBanknote = new OneThousandBanknote();
        CountedBanknote<OneThousandBanknote> oneThousandBanknoteCountedBanknote = new CountedBanknote<>(40,oneThousandBanknote);
        FiveThousandBanknote fiveThousandBanknote = new FiveThousandBanknote();
        CountedBanknote<FiveThousandBanknote> fiveThousandBanknoteCountedBanknote = new CountedBanknote<>(20,fiveThousandBanknote);

        ATMReview newATMReview = new ATMReview(fiftyBanknoteCountedBanknote,oneHundredBanknoteCountedBanknote,fiveHundredBanknoteCountedBanknote,oneThousandBanknoteCountedBanknote,fiveThousandBanknoteCountedBanknote);

        System.out.println(fiftyBanknoteCountedBanknote.count());
        System.out.println(oneHundredBanknoteCountedBanknote.count());
        System.out.println(fiveHundredBanknoteCountedBanknote.count());
        System.out.println(oneThousandBanknoteCountedBanknote.count());
        System.out.println(fiveThousandBanknoteCountedBanknote.count());
    }

}
