package banksystem.exceptions;

public class AddressNotFoundException extends RuntimeException {
    private final String message;

    public AddressNotFoundException(int message) {

        this.message = "Address not found... ";
    }
}
