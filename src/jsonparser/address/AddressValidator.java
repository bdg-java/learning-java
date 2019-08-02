package jsonparser.address;

import jsonparser.Validator;
import jsonparser.enums.Country;
import jsonparser.enums.PhoneType;

import java.util.ArrayList;
import java.util.List;

public class AddressValidator implements Validator {
    private Country country;
    private String street;
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    @Override
    public boolean isValid(String jsonContent) {

        String countryValue = null;
        String countryCode = null;
        String[] strings = jsonContent.split(",");
        String phoneType = null;
        String number = null;

        for (String string : strings) {
            String[] pair = string.split(":");
            if(pair[0].contains("street") ){
                street =  pair[1];
            }
            if(pair[0].contains(Country.class.getName()) && pair[0].length() == 13){
                countryValue =  pair[1];
            }
            if(pair[0].contains("countryCode") ){
                countryCode =  pair[1];
            }
            if(pair[0].contains("number") ){
                number =  pair[1];
            }

            if(pair[0].contains("phoneType") ){
                phoneType = pair[1];
            }

            PhoneType phoneTypeObj = PhoneType.valueOf("MOBILE");
            PhoneNumber phoneNumber = new PhoneNumber(countryCode, number, phoneTypeObj);
            phoneNumbers.add(phoneNumber);
        }
        if (countryValue != null) {
            countryValue = countryValue.replace(" \"", "");
            countryValue = countryValue.replace("\"", "");
            country = Country.valueOf(countryValue);
            return true;
        }

        return false;
    }


    Country getCountry() {
        return country;
    }

    String getStreet() {
        return street;
    }

    List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
}
