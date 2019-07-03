package com.BankAccount.service.address;

import com.BankAccount.dbo.AddressCreationRequest;
import com.BankAccount.entity.Address;
import com.BankAccount.exception.AddressNotFoundException;
import com.BankAccount.service.BankAccountBaseService;
import com.BankAccount.storage.MemoryStorage;
import com.BankAccount.storage.Storage;

import java.time.LocalDate;

public class AddressService implements BankAccountBaseService<Address, AddressCreationRequest> {
    private static final Storage<Address> storage = new MemoryStorage<Address>(STORAGE_SIZE);

    @Override
    public Address create(AddressCreationRequest requset) {
        Address address = new Address(requset.country, requset.street, requset.phonenumber);
        return storage.add(address);
    }

    @Override
    public Address get(int id) throws AddressNotFoundException {
        Address addrees = storage.get(id);
        if (addrees != null)
            return addrees;
        throw new AddressNotFoundException(id);
    }

    @Override
    public Address remove(int id) throws AddressNotFoundException {
        Address address = storage.get(id);
        if (address != null) {
            address.setDeleteDate(LocalDate.now());
            return address;
        }
        throw new AddressNotFoundException(id);
    }

    @Override
    public Address update(int id, AddressCreationRequest request) throws AddressNotFoundException {
        Address address = storage.get(id);
        if (address != null) {
            address.setDeleteDate(LocalDate.now());
            return storage.add(new Address(request.country, request.street, request.phonenumber));
        }
        throw new AddressNotFoundException(id);
    }
}
