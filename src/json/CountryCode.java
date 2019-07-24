package json;

public enum CountryCode {
    ARM("+374", Country.AM),
    RU("+742", Country.RU);

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    public String toString() {
        return this.country + " ( " + this.countryCode + " )";
    }
}
