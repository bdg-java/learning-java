package ahakobyan.classLessons.bank.country;

import ahakobyan.classLessons.bank.phone.PhoneNumber;

public class AddressServiceImpl implements AddressService {


    @Override
    public Address add(Country country, String street, PhoneNumber phoneNumber) {

        Country country1 = Country.AM;
        PhoneNumber[] phoneNumber1 = new PhoneNumber[10];

        Address address = new Address(country1,"Baxramyan",phoneNumber1);
        return address;
    }
}
