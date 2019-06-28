package banksystem.exceptions;

public class PhoneNumberNotFoundException extends RuntimeException {
    private final String message;

    public PhoneNumberNotFoundException(String number) {
        this.message = "Phone number {" + number + "} is not found...";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
