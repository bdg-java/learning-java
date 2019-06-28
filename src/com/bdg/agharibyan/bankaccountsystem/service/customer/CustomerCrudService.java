package com.bdg.agharibyan.bankaccountsystem.service.customer;

import com.bdg.agharibyan.bankaccountsystem.entity.Address;
import com.bdg.agharibyan.bankaccountsystem.entity.Customer;
import com.bdg.agharibyan.bankaccountsystem.storage.Storage;
import com.bdg.agharibyan.bankaccountsystem.storage.CustomerStorage;

public class CustomerCrudService implements CustomerService {

    private final Storage customerStorage = new CustomerStorage();

    @Override
    public Customer create(String customerName, String customerSurname, Address customerAddress){
        final Customer customer = new Customer(customerName, customerSurname, customerAddress);

        if(customerStorage.add(customer)){
            return customer;
        }
        return null;
    }

    @Override
    public Customer get(int id){

        return null;
    }
}
