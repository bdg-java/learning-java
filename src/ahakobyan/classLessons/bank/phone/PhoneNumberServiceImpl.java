package ahakobyan.classLessons.bank.phone;

import ahakobyan.classLessons.bank.country.CountryCode;

public class PhoneNumberServiceImpl implements PhoneNumberService {


    @Override
    public PhoneNumber add(CountryCode code, String number, PhoneType type) {

        CountryCode code1 = CountryCode.ARM;
        PhoneType type1 = PhoneType.Home;

        if (type1 == null) {
            throw new PhoneNumberAddException();
        }

        PhoneNumber phoneNumber = new PhoneNumber(code1,"041403070", type1);
        return phoneNumber;
    }
}
