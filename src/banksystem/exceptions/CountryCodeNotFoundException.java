package banksystem.exceptions;

public class CountryCodeNotFoundException extends RuntimeException {
    private final String message;

    public CountryCodeNotFoundException(String code) {
    this.message = "Country code is not found...";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
