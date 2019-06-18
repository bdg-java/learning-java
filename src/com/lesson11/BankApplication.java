package com.lesson11;

import java.util.Arrays;

public class BankApplication {
    public static void main(String[] args) {
        Country c = Country.AM;
        System.out.println(CountryCode.ARM);
        System.out.println(PhoneType.HOME.asLowerCase());
        System.out.println(new PhoneNumber(5, CountryCode.ARM, "s", PhoneType.HOME));

    }
}
