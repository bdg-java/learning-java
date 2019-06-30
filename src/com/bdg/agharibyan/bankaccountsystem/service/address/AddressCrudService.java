package com.bdg.agharibyan.bankaccountsystem.service.address;

import com.bdg.agharibyan.bankaccountsystem.common.exception.AddressNotFoundException;
import com.bdg.agharibyan.bankaccountsystem.common.type.Country;
import com.bdg.agharibyan.bankaccountsystem.entity.AbstractBankEntity;
import com.bdg.agharibyan.bankaccountsystem.entity.Address;
import com.bdg.agharibyan.bankaccountsystem.entity.PhoneNumber;
import com.bdg.agharibyan.bankaccountsystem.storage.AddressStorage;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;

public class AddressCrudService implements AddressService{

    private final Storage addressStorage = new AddressStorage();

    @Override
    public Address create(Country country, String street, PhoneNumber[] phoneNumbers) {
        final Address address = new Address(country,street,phoneNumbers);
        if(addressStorage.add(address)){
            return address;
        }
        return null;
    }

    @Override
    public Address get(int id) {
        AbstractBankEntity address = addressStorage.get(id);
        if(address == null){
            throw new AddressNotFoundException(id);
        }
        return (Address) address;
    }

    @Override
    public Address delete(int id) {
        if(addressStorage.remove(id)){
            return this.get(id);
        }
        return null;
    }
}
