package com.bdg.bankaccountsystem.services;


import com.bdg.bankaccountsystem.Customer;
import com.bdg.bankaccountsystem.common.Address;
import com.bdg.bankaccountsystem.storage.Storage;
import com.bdg.bankaccountsystem.storage.customer.CustomerStorage;

public class CustomerCrudService implements CustomerService {

    private final Storage customerStorage = new CustomerStorage();


    @Override
    public Customer create(String customerName, String customerSurname, Address customerAddress, int id) {
        Customer customer = new Customer(customerName, customerSurname, customerAddress, id);
        if (customerStorage.add(customer)) {
            return customer;
        }
        return null;
    }

    @Override
    public Customer get(int id) {
        return null;
    }
}
