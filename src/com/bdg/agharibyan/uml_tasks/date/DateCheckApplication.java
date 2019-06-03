package com.bdg.agharibyan.uml_tasks.date;

public class DateCheckApplication {
    public static void main(String[] args) {

        Date object = Date.createInstance(1,6,2000);

        System.out.println(object.getDay());
        System.out.println(object.getMonth());
        System.out.println(object.getYear());
        object.setDay(3);
        System.out.println(object.getDay());
        object.setMonth(6);
        System.out.println(object.getMonth());
        object.setYear(2019);
        System.out.println(object.getYear());
        object.setDate(18,07,1988);
        System.out.println(object.getDay());
        System.out.println(object.getMonth());
        System.out.println(object.getYear());
        System.out.println(object.toString());
    }
}
