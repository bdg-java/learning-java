package ahakobyan.classLessons.bank.creditCard;

public class InvalidCardTypeException extends RuntimeException {

    private final String DEFAULT_MESSAGE = "Card Type not found with name %s...";
    private final String message;

    public InvalidCardTypeException(String cardType) {
        this.message = String.format(DEFAULT_MESSAGE, cardType);
    }


    public String getMessage() {
        return this.message;
    }
}
