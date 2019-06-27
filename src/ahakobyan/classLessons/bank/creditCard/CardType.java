package ahakobyan.classLessons.bank.creditCard;

public enum CardType {

    VISA, ARCA, MASTERCARD, AMERICANEXPRESS;

    public static CardType find(String cardType) {

        CardType found = null;
        for(CardType value : values()) {
            if (value.name().equalsIgnoreCase(cardType)) {
                found = value;
            }
        }

        if (found == null) {
            throw new InvalidCardTypeException(cardType);
        }
        return found;
    }
}