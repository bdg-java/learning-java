package com.bdg.questions;

import com.bdg.Address;

import java.util.ArrayList;
import java.util.List;

public final class Imutable {
    private final String name;
    private final List<Address> addresses;

    public Imutable(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = new ArrayList<>(addresses.size());
        for (Address addr : addresses) {
            Address tmp = new Address();
            tmp.street = addr.street;
            this.addresses.add(tmp);
        }
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return new ArrayList<>(addresses);
    }


    @Override
    public String toString() {
        return "IMutable{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
