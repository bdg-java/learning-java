package ahakobyan.classLessons.bank.account;


public class AccountCreationException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Your details is not valid...";
    private final String message;

    public AccountCreationException() {
        this.message = String.format(DEFAULT_MESSAGE);
    }

    public String getMessage() {
        return this.message;
    }
}
