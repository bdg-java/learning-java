package com.bdg.agharibyan.inheritancehomework.personandsubclasses;

public class Application {
    public static void main(String[] args) {

        Person personDemo = new Person("Ani", "Yerevan");
        Student studentDemo = new Student("Ani","Yerevan", "Java", 2019, 50000);
        Staff staffDemo = new Staff("Ani", "Yerevan", "BDG", 200000);

        System.out.println(personDemo.getName());
        System.out.println(personDemo.getAddress());
        System.out.println(studentDemo.getProgram());
        System.out.println(studentDemo.getYear());
        System.out.println(studentDemo.getFee());
        System.out.println(staffDemo.getSchool());
        System.out.println(staffDemo.getPay());

        personDemo.setAddress("Vanadzor");
        studentDemo.setProgram("Android");
        studentDemo.setYear(2020);
        studentDemo.setFee(55000);
        staffDemo.setSchool("BDG");
        staffDemo.setPay(220000);

        System.out.println(personDemo.toString());
        System.out.println(studentDemo.toString());
        System.out.println(staffDemo.toString());
    }

    //karogh em toStringum im hascei popokhutyuny artapatkerel` Studenti ev Staffi toStringum toghnelov superi toStringy(inchpes hima grvats e)?
}
