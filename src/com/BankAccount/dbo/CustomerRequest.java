package com.BankAccount.dbo;

public class CustomerRequest {
    public String customerName;
    public String customerSurname;
    public AddressCreationRequest customerAddress;

    public CustomerRequest(int id, String customerName, String customerSurname, AddressCreationRequest customerAddress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAddress = customerAddress;
    }
}
