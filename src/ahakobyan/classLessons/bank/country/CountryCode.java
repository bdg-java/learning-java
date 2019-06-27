package ahakobyan.classLessons.bank.country;

public  enum  CountryCode {

    ARM("+374",Country.AM);

    public static CountryCode find(String countryCode) {
        CountryCode found = null;
        for(CountryCode value : values()) {
            if (value.countryCode.equals(countryCode)) {
                found = value;
            }
        }

        if (found == null) {
            throw new InvalidCountryCodeException(countryCode);
        }

        return found;
    }

    private String countryCode;
    private Country country;

   CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }
}
