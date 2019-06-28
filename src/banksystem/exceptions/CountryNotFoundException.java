package banksystem.exceptions;

public class CountryNotFoundException extends RuntimeException {
    private final String message;

    public CountryNotFoundException(String name) {
        this.message = "Country Not Found...";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
