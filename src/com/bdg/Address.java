package com.bdg;

public final class Address {
    public String street;

    public String getStreet() {
        return street;
    }



    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }
}
