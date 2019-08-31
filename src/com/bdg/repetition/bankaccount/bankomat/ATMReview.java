package com.bdg.repetition.bankaccount.bankomat;


/**
 * @author William Arustamyan
 */


public final class ATMReview {


    private final CountedBanknote<FiftyBanknote> fiftyBanknote;
    private final CountedBanknote<FiveThousandBanknote> fiveThousandBanknote;
    private final CountedBanknote<OneHundredBanknote> oneHundredBanknote;
    private final CountedBanknote<OneThousandBanknote> oneThousandBanknote;


    public ATMReview(
            final CountedBanknote<FiftyBanknote> fiftyBanknote, final CountedBanknote<FiveThousandBanknote> fiveThousandBanknote,
            final CountedBanknote<OneHundredBanknote> oneHundredBanknote, final CountedBanknote<OneThousandBanknote> oneThousandBanknote
    ) {
        this.fiftyBanknote = fiftyBanknote;
        this.fiveThousandBanknote = fiveThousandBanknote;
        this.oneHundredBanknote = oneHundredBanknote;
        this.oneThousandBanknote = oneThousandBanknote;
    }

}
