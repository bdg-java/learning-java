package com.bdg.BankAccountSystem;

public class Address extends  AbstractBankEntery{
    private String country;
    private String steet;
    private PhoneNumber phonenumber[];


    public Address(int id, String country, String steet, PhoneNumber phoneNumber){
        super(id);
        this.country = country;
        this.steet = steet;
        this.phonenumber = phonenumber;

    }

    public String getCountry() {
        return country;
    }

    public String getSteet() {
        return steet;
    }

    public PhoneNumber[] getPhonenumber() {
        return phonenumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSteet(String steet) {
        this.steet = steet;
    }

    public void setPhonenumber(PhoneNumber[] phonenumber) {
        this.phonenumber = phonenumber;
    }
}
