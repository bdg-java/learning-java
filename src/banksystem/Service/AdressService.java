package banksystem.Service;

import banksystem.Country;
import banksystem.PhoneNumber;
import banksystem.Address;

public interface AdressService {

    Address create(int id, Country country, String street, PhoneNumber[] phonenumber);

    }

