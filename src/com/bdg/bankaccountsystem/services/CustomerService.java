package com.bdg.bankaccountsystem.services;

import com.bdg.bankaccountsystem.Customer;
import com.bdg.bankaccountsystem.common.Address;

public interface CustomerService {
    Customer create(String customerName, String customerSurname, Address customerAddress, int id);
    Customer get(int id);
}
