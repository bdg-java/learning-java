package com.lesson11;

import com.lesson11.enumentity.Country;
import com.lesson11.service.*;

import java.util.Arrays;

public class BankApplication {
    public static void main(String[] args) {
      /*  CreditCardService service = new CreditCardCrudService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        service.create(generator.generate(), 10, "10-10-2020", "VISA");
        service.create(generator.generate(), 11, "10-10-2020", "Master");
        System.out.println(service.get(1));
        System.out.println(service.remove(2));*/


        PhoneNumber[] phoneNumbers = new PhoneNumber[2];
        phoneNumbers[0] = new PhoneNumber(CountryCode.ARM, "565965", PhoneType.HOME);
        phoneNumbers[1] = new PhoneNumber(CountryCode.ARM, "125465", PhoneType.WORK);

        PhoneNumber[] phoneNumberChina = new PhoneNumber[2];
        phoneNumberChina[0] = new PhoneNumber(CountryCode.CH, "565599622965", PhoneType.HOME);

        AddressService addressService = new AddressServiceImplementation();
        addressService.create(Country.AM, "Abovyan", phoneNumbers);
        addressService.create(Country.CN, "HGHGHGHGHHG", phoneNumberChina);
        addressService.create(Country.AM, "Teryan", phoneNumbers);
        System.out.println(addressService.getId(1));
        System.out.println(addressService.getId(2));
        System.out.println(addressService.getId(3));

        System.out.println(addressService.update(3, Country.AM, "Saryan", phoneNumbers));
        System.out.println(addressService.getId(3));
        System.out.println(addressService.remove(2));
        System.out.println(addressService.getId(2));



    }
}
