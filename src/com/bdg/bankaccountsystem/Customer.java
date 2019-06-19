package com.bdg.bankaccountsystem;

public class Customer {
    private String customerName;
    private String customerSurname;
    private Address customerAddress;

    public Customer(String customerName, String customerSurname, Address customerAddress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAddress = customerAddress;
    }

    public Address getCustomerAddress() {
        return this.customerAddress;
    }

    public String getCustomerSurname() {
        return this.customerSurname;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }
}
