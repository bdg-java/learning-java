package banksystem.Service;

import banksystem.Address;
import banksystem.Customer;

public interface CustomerService {
    Customer create(String customerName, String customerSurname, Address customerAddress, int id);
    Customer get(int id);
}
