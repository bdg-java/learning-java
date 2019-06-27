package ahakobyan.classLessons.bank.Customer;

import ahakobyan.classLessons.bank.bankSystem.Storage;
import ahakobyan.classLessons.bank.country.Address;
import ahakobyan.classLessons.bank.country.Country;
import ahakobyan.classLessons.bank.phone.PhoneNumber;

public class CustomerCrudService  implements CustomerCreateService {

    private String name;
    private String surname;
    private String street;
    private Address address = new Address(Country.AM,street,new PhoneNumber[10]);
    private Storage customersStorage = new CustomerStroage();

    @Override
    public Customer create(String name, String surname, Address address) {

        this.name = name;
        this.surname = surname;

        final Customer customer = new Customer(name, surname, address);
        if(customersStorage.add(customer)) {
            return customer;
        }
        return null;
    }


}
