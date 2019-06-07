package com.bdg.HomeworkInheritance;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public String getSchool() {
        return school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString(){
        return "name:"+ name + "address" + address + "pay" + pay + "school" + school;
    }
}
