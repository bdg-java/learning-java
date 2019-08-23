package com.bdg.bankomat;

public class Bankomat {


    private int countFifty;
    private int countHundred;
    private int countFiveHundred;
    private int countOneThousand;
    private int countFiveThousand;

    public Bankomat(int countFifty, int countHundred, int countFiveHundred, int countOneThousand, int countFiveThousand) {
        this.countFifty = countFifty;
        this.countHundred = countHundred;
        this.countFiveHundred = countFiveHundred;
        this.countOneThousand = countOneThousand;
        this.countFiveThousand = countFiveThousand;
    }

    public void cashOut(int cash) {
        int fiveThousand = 0;
        int oneThousand = 0;
        int fiveHundred = 0;
        int hundred = 0;
        int fifty = 0;
        int balance = 0;
        if (cash >= Banknotes.FIFTY.getAmount()) {
            if (cash >= Banknotes.FIVE_THOUSAND.getAmount()) {
                if (cash % Banknotes.FIVE_THOUSAND.getAmount() == 0) {
                    fiveThousand = cash / Banknotes.FIVE_THOUSAND.getAmount();
                    countFiveThousand -= fiveThousand;
                    return;
                } else {
                    fiveThousand = cash / Banknotes.FIVE_THOUSAND.getAmount();
                    countFiveThousand -= fiveThousand;
                    oneThousand = cash % Banknotes.FIVE_THOUSAND.getAmount();
                    cash = cash - (fiveThousand * Banknotes.FIVE_THOUSAND.getAmount());
                    if (oneThousand % Banknotes.ONE_THOUSAND.getAmount() == 0) {
                        oneThousand = cash / Banknotes.ONE_THOUSAND.getAmount();
                        countOneThousand -= oneThousand;
                        return;
                    } else {
                        if (oneThousand >= 50 && oneThousand < 5000) {
                            oneThousand = cash / Banknotes.ONE_THOUSAND.getAmount();
                            countOneThousand -= oneThousand;
                            cash = cash - (oneThousand * Banknotes.ONE_THOUSAND.getAmount());
                            fiveHundred = cash % Banknotes.ONE_THOUSAND.getAmount();
                            if (fiveHundred % Banknotes.FIVE_HUNDRED.getAmount() == 0) {
                                fiveHundred = fiveHundred / Banknotes.FIVE_HUNDRED.getAmount();
                                countFiveHundred -= fiveHundred;
                                return;
                            } else {
                                if (fiveHundred >= 50 && fiveHundred < 5000) {
                                    fiveHundred = fiveHundred / Banknotes.FIVE_HUNDRED.getAmount();
                                    countFiveHundred -= fiveHundred;
                                    cash = cash - (fiveHundred * Banknotes.FIVE_HUNDRED.getAmount());
                                    hundred = cash % Banknotes.FIVE_HUNDRED.getAmount();
                                    if (hundred % Banknotes.HUNDRED.getAmount() == 0) {
                                        hundred = cash/ Banknotes.HUNDRED.getAmount();
                                        countHundred -= hundred;
                                        return;
                                    }
                                    else {
                                        if (hundred >= 50 && hundred < 5000) {
                                            hundred = hundred / Banknotes.HUNDRED.getAmount();
                                            countHundred -= hundred;
                                            cash = cash - (hundred * Banknotes.HUNDRED.getAmount());
                                            fifty = cash % Banknotes.HUNDRED.getAmount();
                                            if (fifty % Banknotes.FIFTY.getAmount() == 0) {
                                                fifty = fifty / Banknotes.FIFTY.getAmount();
                                                countFifty -= fifty;
                                                return;
                                            } else if (fifty > Banknotes.FIFTY.getAmount()){
                                                fifty = cash / Banknotes.FIFTY.getAmount();
                                                countFifty -= fifty;
                                                balance = cash % Banknotes.FIFTY.getAmount();
                                            }
                                            else if (fifty < Banknotes.FIFTY.getAmount()){
                                                fifty = 0;
                                                balance = cash % Banknotes.FIFTY.getAmount();
                                            }

                                            else{
                                                System.out.println("error");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        else {
            System.out.println("You are out of cash");
        }
        System.out.println("Bankomat.cashOut is " + fiveThousand+" "+Banknotes.FIVE_THOUSAND.name() + " , "+ oneThousand+
                ""+Banknotes.ONE_THOUSAND.name()+" , " + fiveHundred + " " + Banknotes.FIVE_HUNDRED.name()+" , "
                + hundred+" "+ Banknotes.HUNDRED.name()+" , "+ fifty+" "+ Banknotes.FIFTY.name() + " , your balance is "+ balance );

    }

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(12,12,12,12,12);
        bankomat.cashOut(19950);
        System.out.println(bankomat.countFifty +" , " + bankomat.countHundred+" , "+bankomat.countFiveHundred+" , "+ bankomat.countOneThousand+" , "+ bankomat.countFiveThousand);
    }
}


