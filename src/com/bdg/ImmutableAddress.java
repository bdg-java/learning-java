package com.bdg;

public class ImmutableAddress {
    private final Address address;

    public ImmutableAddress(final Address address) {
        StringBuilder nameBuilder = new StringBuilder(address.getStreet());

        this.address = new Address();
        this.address.setStreet(nameBuilder.toString());
    }

    public String addressStreet() {
        return this.address.getStreet();
    }
}
