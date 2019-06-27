package ahakobyan.classLessons.bank.country;

import ahakobyan.classLessons.bank.phone.PhoneNumber;

public interface AddressService {

    Address add(Country country, String street, PhoneNumber phoneNumber);
}
