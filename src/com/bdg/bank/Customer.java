package com.bdg.bank;

public class Customer {
    private String customerName;
    private String customerSurname;
    private String customerAddress;

    public Customer (String customerName, String customerSurname, String customerAddress) {
        this.customerName=customerName;
        this.customerSurname=customerSurname;
        this.customerAddress=customerAddress;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerSurname() {
        return this.customerSurname;
    }
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname=customerSurname;
    }
    public String getCustomerAddress() {
        return this.customerAddress=customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress=customerAddress;
    }
    public String toString() {
        return "Customer [" + this.customerName + " , " + this.customerSurname + "," +this.customerAddress+"]";
    }
}