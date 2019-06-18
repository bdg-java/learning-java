package com.lesson11;

public class Customer extends AbstractBankEntity {
    private String customerName;
    private String customerSurname;
    private Address customerAddress;

    public Customer(int id, String customerName, String customerSurname, Address customerAddress) {
        super(id);
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String toString() {
        return this.customerName + ", " + this.customerSurname + " , " + this.customerAddress;
    }
}
