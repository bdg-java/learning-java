package ahakobyan.classLessons.bank.phone;

public class PhoneNumberAddException extends RuntimeException {

    private final String message;

    public PhoneNumberAddException() {
        this.message = "Invalid Phone Number...";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
