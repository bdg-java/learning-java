package ahakobyan.classLessons.bank.account;

public class AccountNotFoundException extends RuntimeException {

    private final String message;

    public AccountNotFoundException() {
        this.message = "Invalid parameters...";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
