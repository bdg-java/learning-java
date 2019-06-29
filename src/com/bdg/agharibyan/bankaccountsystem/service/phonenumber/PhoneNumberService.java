package com.bdg.agharibyan.bankaccountsystem.service.phonenumber;

import com.bdg.agharibyan.bankaccountsystem.common.type.CountryCode;
import com.bdg.agharibyan.bankaccountsystem.common.type.PhoneType;
import com.bdg.agharibyan.bankaccountsystem.entity.PhoneNumber;

public interface PhoneNumberService {

    PhoneNumber create(CountryCode countryCode, String number, PhoneType type);

    PhoneNumber get(int id);

    PhoneNumber delete(int id);
}
