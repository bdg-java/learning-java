package ahakobyan.classLessons.bank.country;

public class InvalidCountryCodeException extends RuntimeException {

    private final String message;

    public InvalidCountryCodeException(String countryCode) {
        this.message = "Country Code is invalid...";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
