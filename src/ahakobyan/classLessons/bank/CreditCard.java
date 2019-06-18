package ahakobyan.classLessons.bank;

public class CreditCard extends AbstractBankEntity {

    private String cardnumber;
    private int accountNumber;
    private Date expirationDate;
    private enum CardType {cardType};

    public CreditCard(int accountNumber, Date expDate, CardType cardType) {
        this.accountNumber = accountNumber;
        this.expirationDate = expDate;
        cardType = cardType;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public CardType cardType() {
        return this.cardType();
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
