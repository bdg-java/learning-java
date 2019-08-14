package com.bdg.questions;

import com.bdg.Address;

import java.util.List;

public class Mutable {

    private String name;
    private List<Address> addresses;

    public Mutable(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Mutable{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
