package banksystem;

public class PhoneNumber extends AbstractBankEntity {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(int id, CountryCode countryCode, String number, PhoneType type) {
        this.id = (id);
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
}
