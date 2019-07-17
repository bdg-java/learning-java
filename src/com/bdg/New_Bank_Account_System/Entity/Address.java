package com.bdg.New_Bank_Account_System.Entity;

public class Address {

    private String streetName;
    private int houseNum;

    public Address(String streetName, int houseNum) {
        this.streetName = streetName;
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNum=" + houseNum +
                '}';
    }
}
