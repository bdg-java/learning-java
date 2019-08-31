package com.bdg.repetition.bankaccount.bankomat;


/**
 * @author William Arustamyan
 */


public final class ATMReview {


    private final CountedBanknote<FiftyBanknote> fiftyBanknote;
    private final CountedBanknote<OneHundredBanknote> oneHundredBanknote;
    private final CountedBanknote<FiveHundredBanknote> fiveHundredBanknote;
    private final CountedBanknote<OneThousandBanknote> oneThousandBanknote;
    private final CountedBanknote<FiveThousandBanknote> fiveThousandBanknote;


    public ATMReview(final CountedBanknote<FiftyBanknote> fiftyBanknote,
                     final CountedBanknote<OneHundredBanknote> oneHundredBanknote,
                     final CountedBanknote<FiveHundredBanknote> fiveHundredBanknote,
                     final CountedBanknote<OneThousandBanknote> oneThousandBanknote,
                     final CountedBanknote<FiveThousandBanknote> fiveThousandBanknote){
        this.fiftyBanknote = fiftyBanknote;
        this.oneHundredBanknote = oneHundredBanknote;
        this.fiveHundredBanknote = fiveHundredBanknote;
        this.oneThousandBanknote = oneThousandBanknote;
        this.fiveThousandBanknote = fiveThousandBanknote;
    }



}
