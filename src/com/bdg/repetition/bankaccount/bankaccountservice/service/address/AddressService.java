package com.bdg.repetition.bankaccount.bankaccountservice.service.address;

import com.bdg.repetition.bankaccount.bankaccountservice.common.Country;
import com.bdg.repetition.bankaccount.bankaccountservice.entity.Address;
import com.bdg.repetition.bankaccount.bankaccountservice.request.AddressCreationRequest;
import com.bdg.repetition.bankaccount.bankaccountservice.service.BankAccountService;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.MemoryStorage;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.Storage;

public class AddressService implements BankAccountService<Address, AddressCreationRequest> {

    private final Storage<Address> storage = new MemoryStorage<>(STORAGE_SIZE);

    @Override
    public Address create(AddressCreationRequest request) {
        Address address = new Address(Country.findByName(request.countryName),request.cityName,request.street,request.homeNumber,request.phoneNumber);
        return storage.add(address);
    }

    @Override
    public Address get(int id) {
        return storage.get(id);
    }

    @Override
    public Address delete(int id) {
        storage.remove(id);
        return storage.get(id);
    }

}

