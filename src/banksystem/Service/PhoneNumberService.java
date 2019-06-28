package banksystem.Service;

import banksystem.PhoneNumber;
import banksystem.CountryCode;
import banksystem.PhoneType;

public interface PhoneNumberService {
    PhoneNumber create(CountryCode code, String number, PhoneType type );
}
