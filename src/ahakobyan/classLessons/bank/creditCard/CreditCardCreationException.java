package ahakobyan.classLessons.bank.creditCard;

public class CreditCardCreationException extends RuntimeException {

    private final String message;

    public CreditCardCreationException () {
        this.message = "Your details are invalid...";
    }

    public String getMessage() {
        return this.message;
    }
}
