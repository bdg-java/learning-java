package com.bdg.agharibyan.bankaccountsystem.service.customer;

import com.bdg.agharibyan.bankaccountsystem.entity.Address;
import com.bdg.agharibyan.bankaccountsystem.entity.Customer;

public interface CustomerService {

    Customer create(String customerName, String customerSurname, Address customerAddress);

    Customer get(); // chem haskanum inch fieldov e petq get anel Customery..id-ov?
}
