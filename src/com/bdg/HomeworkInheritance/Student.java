package com.bdg.HomeworkInheritance;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public int getYear() {
        return year;
    }

    public String getProgram() {
        return program;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "name:"+ name + "," + "address:" + address +","+ "Program:"+ program + "," + "year:" + year + "," + "fee" + fee  ;
    }
}
