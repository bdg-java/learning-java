package com.bdg.BankAccountSystem;

public class Customer extends AbstractBankEntery{
    private String customerName;
    private String customerSurName;
    private String customerAddress;

    public Customer(int id, String customerName, String customerSurName, String customerAddress){
        super(id);
        this.customerName = customerName;
        this.customerSurName = customerSurName;
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurName() {
        return customerSurName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSurName(String customerSurName) {
        this.customerSurName = customerSurName;
    }

}
