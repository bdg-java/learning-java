package com.lesson11.service;

import com.lesson11.PhoneNumber;
import com.lesson11.entity.AbstractBankEntity;
import com.lesson11.entity.Address;
import com.lesson11.enumentity.Country;

public interface AddressService {
    Address create(Country country, String street, PhoneNumber[] phoneNumbers);

    boolean update(int id, Country country, String street, PhoneNumber[] phoneNumbers);

    boolean remove(int id);

    Address getId(int id);

}
