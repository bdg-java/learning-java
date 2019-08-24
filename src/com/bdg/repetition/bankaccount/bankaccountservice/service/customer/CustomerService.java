package com.bdg.repetition.bankaccount.bankaccountservice.service.customer;

import com.bdg.repetition.bankaccount.bankaccountservice.common.Country;
import com.bdg.repetition.bankaccount.bankaccountservice.entity.Address;
import com.bdg.repetition.bankaccount.bankaccountservice.entity.Customer;
import com.bdg.repetition.bankaccount.bankaccountservice.request.AddressCreationRequest;
import com.bdg.repetition.bankaccount.bankaccountservice.request.CustomerCreationRequest;
import com.bdg.repetition.bankaccount.bankaccountservice.service.BankAccountService;
import com.bdg.repetition.bankaccount.bankaccountservice.service.address.AddressService;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.MemoryStorage;
import com.bdg.repetition.bankaccount.bankaccountservice.storage.Storage;

public class CustomerService implements BankAccountService<Customer, CustomerCreationRequest> {

    private final Storage<Customer> storage = new MemoryStorage<>(STORAGE_SIZE);
    private final BankAccountService<Address, AddressCreationRequest> addressService = new AddressService();

    @Override
    public Customer create(CustomerCreationRequest request) {
        Address address1 = new Address(Country.findByName(request.addressCreationRequest.countryName),request.addressCreationRequest.cityName, request.addressCreationRequest.street,request.addressCreationRequest.homeNumber,request.addressCreationRequest.phoneNumber);
        Address address2 = addressService.create(request.addressCreationRequest);
        Customer customer1 = new Customer(request.firstName,request.lastName, address1);
        Customer customer2 = new Customer(request.firstName, request.lastName,address2);
        return storage.add(customer1);
        //return storage.add(customer2);  - inch tarberutyun customer1i  ev customer2i mijev?vor tarberakn e chisht kirarel?
    }

    @Override
    public Customer get(int id) {
        return storage.get(id);
    }

    @Override
    public Customer delete(int id) {
        storage.remove(id);
        return storage.get(id);
    }

}
