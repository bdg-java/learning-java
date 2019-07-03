package com.BankAccount.service.customer;

import com.BankAccount.dbo.AddressCreationRequest;
import com.BankAccount.dbo.CustomerRequest;
import com.BankAccount.entity.Address;
import com.BankAccount.entity.Customer;
import com.BankAccount.exception.CustomerNotFoundException;
import com.BankAccount.service.BankAccountBaseService;
import com.BankAccount.service.address.AddressService;
import com.BankAccount.storage.MemoryStorage;
import com.BankAccount.storage.Storage;

import java.time.LocalDate;

public class CustomerService implements BankAccountBaseService<Customer, CustomerRequest> {
    private final static Storage<Customer> storage = new MemoryStorage<Customer>(STORAGE_SIZE);
    private final BankAccountBaseService<Address, AddressCreationRequest> addressService = new AddressService();

    @Override
    public Customer create(CustomerRequest request) {
        return storage.add(new Customer(request.customerName, request.customerSurname, addressService.create(request.customerAddress)));
    }

    @Override
    public Customer get(int id) throws CustomerNotFoundException {
        Customer customer = storage.get(id);
        if (customer != null)
            return customer;
        throw new CustomerNotFoundException(id);
    }

    @Override
    public Customer remove(int id) throws CustomerNotFoundException {
        Customer customer = storage.get(id);
        if (customer != null) {
            customer.setDeleteDate(LocalDate.now());
            return customer;
        }
        throw new CustomerNotFoundException(id);
    }

    @Override
    public Customer update(int id, CustomerRequest request) throws CustomerNotFoundException {
        Customer customer = storage.get(id);
        if (customer != null) {
            customer.setDeleteDate(LocalDate.now());
            return storage.add(new Customer(request.customerName, request.customerSurname, addressService.create(request.customerAddress)));
        }
        throw new CustomerNotFoundException(id);
    }
}
