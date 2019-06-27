package ahakobyan.classLessons.bank.country;

public class AddressNotFoundException extends RuntimeException {

    private final String message;

    public AddressNotFoundException() {
        this.message = "Invalid Address...";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
