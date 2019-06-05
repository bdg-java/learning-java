package com.bdg;

public class Author {
    String FirstName;
    String LastName;

    public Author(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Double getFirstName(){
        double name = Double.parseDouble(FirstName);
        return name;
    }

    public Double getLastName(){
        double Lname = Double.parseDouble(LastName);
        return Lname;
    }

    public  String toString(){
        return "FirstName + LastName";
    }

}
