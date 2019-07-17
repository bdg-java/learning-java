package com.bdg.Bank_Account_System;

public class Customer extends AbstractBankEntity  {

    private String customerName;
    private String customerSurname;
    private Adress adress;

    public Customer(int id,String customerName, String customerSurname, Adress adress) {
        super(id);
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.adress = adress;
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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
