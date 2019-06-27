package ahakobyan.classLessons.bank.Customer;

import ahakobyan.classLessons.bank.country.Address;

public interface CustomerCreateService {

    Customer create(String name, String surname, Address address);
}
