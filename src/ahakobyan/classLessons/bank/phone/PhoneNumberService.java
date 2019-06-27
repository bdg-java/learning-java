package ahakobyan.classLessons.bank.phone;

import ahakobyan.classLessons.bank.country.CountryCode;

public interface PhoneNumberService {

    PhoneNumber add(CountryCode code, String number, PhoneType type );
}
