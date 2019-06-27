package ahakobyan.classLessons.bank.Customer;

import ahakobyan.classLessons.bank.country.Address;
import ahakobyan.classLessons.bank.country.Country;
import ahakobyan.classLessons.bank.phone.PhoneNumber;

public class CustomerCreateSeriveImpl implements CustomerCreateService {

    private String name;
    private String surname;
    private String street;

    @Override
    public Customer create(String name, String surname, Address address) {

        this.name = name;
        this.surname = surname;
         Address address1 = new Address(Country.AM,street, new PhoneNumber[10]);

         if (address1 == null) {
             throw new CustomerCreationException();
         }

         Customer customer = new Customer(name,surname, address1);
         return customer;
    }

    public String getStreet() {
        return this.street;
    }
}
