package banksystem;

public class Address extends AbstractBankEntity {
    private Country country;
    private String street;
    private PhoneNumber phonenumber[];

    public Address(int id, Country country, String street, PhoneNumber[] phonenumber) {
        this.id = id;
        this.country = country;
        this.street = street;
        this.phonenumber = phonenumber;
    }

    public Country getCountry() {
        return country;
    }
    public String getStreet() {
        return street;
    }

    public PhoneNumber[] getPhonenumber() {
        return phonenumber;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhonenumber(PhoneNumber[] phonenumber) {
        this.phonenumber = phonenumber;
    }
}
