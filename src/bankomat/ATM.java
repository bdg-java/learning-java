package bankomat;

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
        int reminder = amount - (tenThousandBanknoteCount * BanknoteEnum.TEN_THOUSAND.getAmount());
        int fiveThousandBanknoteCount = getCountFiveThousand(reminder);
        int reminderFive = reminder - (fiveThousandBanknoteCount * BanknoteEnum.FIVE_THOUSAND.getAmount());
        int thousandBanknoteCount = getCountThousand(reminderFive);
        if (tenThousandBanknoteCount * BanknoteEnum.TEN_THOUSAND.getAmount() +
                fiveThousandBanknoteCount * BanknoteEnum.FIVE_THOUSAND.getAmount()
                + thousandBanknoteCount * BanknoteEnum.THOUSAND.getAmount() != amount
        ) {
            System.out.println("Requested amount is not available .Please try another amount");
        } else {
            System.out.println("Ten thousand " + tenThousandBanknoteCount + " five thousand " +
                    fiveThousandBanknoteCount + " thousand " + thousandBanknoteCount);
        }

    }


    private int getCountTenThousand(int amount) {

        int tenThousandBanknoteCount = 0;
        if (countTenThousand > 0 && amount >= BanknoteEnum.TEN_THOUSAND.getAmount()
                && amount / BanknoteEnum.TEN_THOUSAND.getAmount() <= countTenThousand
        ) {
            tenThousandBanknoteCount = amount / BanknoteEnum.TEN_THOUSAND.getAmount();
        }
        return tenThousandBanknoteCount;
    }

    private int getCountFiveThousand(int amount) {
        int fiveThousandBanknoteCount = 0;
        if (countFiveThousand > 0 &&
                amount >= BanknoteEnum.FIVE_THOUSAND.getAmount()
                && amount / BanknoteEnum.FIVE_THOUSAND.getAmount() <= countFiveThousand
        ) {
            fiveThousandBanknoteCount = amount / BanknoteEnum.FIVE_THOUSAND.getAmount();
        }

        return fiveThousandBanknoteCount;
    }


    private int getCountThousand(int amount) {
        int thousandBanknoteCount = 0;
        if (countThousand > 0 && amount >= BanknoteEnum.THOUSAND.getAmount()
                && amount / BanknoteEnum.THOUSAND.getAmount() <= countThousand) {
            thousandBanknoteCount = amount / BanknoteEnum.THOUSAND.getAmount();
        }

        return thousandBanknoteCount;

    }

}
