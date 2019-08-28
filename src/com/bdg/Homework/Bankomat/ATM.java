package com.bdg.Homework.Bankomat;

public class ATM {
    private int countThousand;
    private int countFiveThousand;
    private int countTenThousand;

    public ATM(int countThousand, int countFiveThousand, int countTenThousand) {
        this.countThousand = countThousand;
        this.countFiveThousand = countFiveThousand;
        this.countTenThousand = countTenThousand;
    }

    public void getMoney(int amount) {
        int tenThousandBanknoteCount = getCountTenThousand(amount);
        int reminder = amount - (tenThousandBanknoteCount * Banknote.TEN_THOUSAND.getAmount());
        int fiveThousandBanknoteCount = getCountFiveThousand(reminder);
        int reminderFive = reminder - (fiveThousandBanknoteCount * Banknote.FIVE_THOUSAND.getAmount());
        int thousandBanknoteCount = getCountThousand(reminderFive);
        if (tenThousandBanknoteCount * Banknote.TEN_THOUSAND.getAmount() +
                fiveThousandBanknoteCount * Banknote.FIVE_THOUSAND.getAmount()
                + thousandBanknoteCount * Banknote.ONE_THOUSAND.getAmount() != amount
        ) {
            System.out.println("Try another amount");
        } else {
            System.out.println("Ten thousand " + tenThousandBanknoteCount + " five thousand " +
                    fiveThousandBanknoteCount + " thousand " + thousandBanknoteCount);
        }

    }


    private int getCountTenThousand(int amount) {

        int tenThousandBanknoteCount = 0;
        if (countTenThousand > 0 && amount >= Banknote.TEN_THOUSAND.getAmount()
                && amount / Banknote.TEN_THOUSAND.getAmount() <= countTenThousand
        ) {
            tenThousandBanknoteCount = amount / Banknote.TEN_THOUSAND.getAmount();
        }
        return tenThousandBanknoteCount;
    }

    private int getCountFiveThousand(int amount) {
        int fiveThousandBanknoteCount = 0;
        if (countFiveThousand > 0 &&
                amount >= Banknote.FIVE_THOUSAND.getAmount()
                && amount / Banknote.FIVE_THOUSAND.getAmount() <= countFiveThousand
        ) {
            fiveThousandBanknoteCount = amount / Banknote.FIVE_THOUSAND.getAmount();
        }

        return fiveThousandBanknoteCount;
    }


    private int getCountThousand(int amount) {
        int thousandBanknoteCount = 0;
        if (countThousand > 0 && amount >= Banknote.ONE_THOUSAND.getAmount()
                && amount / Banknote.ONE_THOUSAND.getAmount() <= countThousand) {
            thousandBanknoteCount = amount / Banknote.ONE_THOUSAND.getAmount();
        }

        return thousandBanknoteCount;

    }

}
