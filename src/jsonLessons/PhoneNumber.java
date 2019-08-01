package jsonLessons;


public class PhoneNumber {
    private CountryCode countryCode;
    private String number;
    private PhoneType phoneType;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType phoneType) {
        this.countryCode = countryCode;
        this.number = number;
        this.phoneType = phoneType;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return this.countryCode + "," + this.number + "," + this.phoneType;
    }
}
