package com.bdg.bankaccountsystem;

public class Customer extends abstractBankEntity {
    private String customerName;
    private String customerSurname;
    private Address customerAddress;
    public Customer(String customerName,String customerSurname,Address customerAddress,int id)
    {
            super(id);
            this.customerAddress = customerAddress;
            this.customerName = customerName;
            this.customerSurname = customerSurname;
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

    public String toString(){
        return "--Customer class--- , full name " + customerName + " " + customerSurname +
                " address :street: "+customerAddress.getStreet()+" country: "+ customerAddress.getCountry()+
                " phone number " + customerAddress.getPhoneNumber().getNumber()+
                " phone code " + customerAddress.getPhoneNumber().getCountryPhoneCode()+
                " phone type " + customerAddress.getPhoneNumber().getType();

    }
}
