package com.bdg.agharibyan.bankaccountsystem.service.address;

import com.bdg.agharibyan.bankaccountsystem.common.type.Country;
import com.bdg.agharibyan.bankaccountsystem.entity.Address;
import com.bdg.agharibyan.bankaccountsystem.entity.PhoneNumber;

public interface AddressService {

    Address create(Country country, String street, PhoneNumber[]phoneNumbers);

    Address get(int id);

    Address delete(int id);

}
