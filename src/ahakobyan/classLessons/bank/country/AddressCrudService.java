package ahakobyan.classLessons.bank.country;

import ahakobyan.classLessons.bank.bankSystem.Storage;
import ahakobyan.classLessons.bank.phone.PhoneNumber;

public class AddressCrudService implements AddressService {

    private Storage addressesStorage = new AddressStorage();


    @Override
    public Address add(Country country, String street, PhoneNumber phoneNumber) {
        final Country country1 = Country.AM;
        final PhoneNumber[] phoneNumber1 = new PhoneNumber[10];
        final Address address = new Address(country1,"Baxramyan", phoneNumber1);

        if (addressesStorage.add(address)) {
            return address;
        }
        return null;
    }
}
