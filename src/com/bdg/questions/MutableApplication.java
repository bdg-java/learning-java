package com.bdg.questions;

import com.bdg.Address;

import java.util.Arrays;
import java.util.List;

public class MutableApplication {

    public static void main(String[] args) {

        Address a1 = new Address();
        a1.street = "a1 street";
        Address a2 = new Address();
        a2.street = "a2 street";

        List<Address> addresses = Arrays.asList(a1, a2);

        Address a3 = new Address();
        a3.street = "a3 street";
        Address a4 = new Address();
        a4.street = "a4 street";


        Imutable mutable = new Imutable("imutable instance", addresses);

        System.out.println(mutable);
//        mutable.getAddresses().set(0, new Address());
        addresses.get(0).street = "TEST";
        System.out.println(mutable);
//        System.out.println(mutable);
    }
}
























