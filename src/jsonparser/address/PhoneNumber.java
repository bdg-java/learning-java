package jsonparser.address;

import jsonparser.enums.PhoneType;

class PhoneNumber {
    private String countryCode;
    private String number;
    private PhoneType phoneType;

    public PhoneNumber(String countryCode, String number, PhoneType phoneType) {

        this.countryCode = countryCode;
        this.number = number;
        this.phoneType = phoneType;
    }

    //Getters
}