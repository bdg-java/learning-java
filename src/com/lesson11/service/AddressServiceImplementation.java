package com.lesson11.service;

import com.lesson11.PhoneNumber;
import com.lesson11.entity.AbstractBankEntity;
import com.lesson11.entity.Address;
import com.lesson11.enumentity.Country;
import com.lesson11.exception.AddreessNotCreated;
import com.lesson11.exception.AddressNotFound;
import com.lesson11.storage.AddressStorage;

import java.time.LocalDate;

public class AddressServiceImplementation implements AddressService {

    private final AddressStorage addressStorage = new AddressStorage();

    public Address create(Country country, String street, PhoneNumber[] phoneNumbers) {
        Address address = new Address(country, street, phoneNumbers);
        if (addressStorage.add(address))
            return address;
        throw new AddreessNotCreated(address.getCountry() + " " + address.getStreet() + ".....");
    }

    @Override
    public boolean update(int id, Country country, String street, PhoneNumber[] phoneNumbers) {
        Address address = (Address) getId(id);
        boolean result = false;
        if (address != null) {
            if (address.getDeleteDate() == null) {
                if (address.getCountry().name().equalsIgnoreCase(country.name())
                        || address.getStreet().equalsIgnoreCase(street)
                        || address.getPhonenumber().equals(phoneNumbers)) {
                    address.setDeleteDate(LocalDate.now());
                    create(country, street, phoneNumbers);
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public boolean remove(int id) {
        return addressStorage.remove(id);
    }

    @Override
    public Address getId(int id) {
        return (Address) addressStorage.get(id);
    }
}
