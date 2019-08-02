package jsonparser.address;

import jsonparser.JsonParser;

public class AddressJsonParser implements JsonParser<Address> {
    private AddressValidator addressValidator = new AddressValidator();

    @Override
    public Address parse(String jsonContent) {
        if (addressValidator.isValid(jsonContent)) {
            return new Address(addressValidator.getCountry(), addressValidator.getStreet(), addressValidator.getPhoneNumbers());

        }
        return null;
    }


}
