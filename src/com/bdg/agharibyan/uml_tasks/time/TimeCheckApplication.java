package com.bdg.agharibyan.uml_tasks.time;

public class TimeCheckApplication {
    public static void main(String[] args) {

        Time object = Time.createInstance(02, 15, 0);

        System.out.println(object.getHour());
        System.out.println(object.getMinute());
        System.out.println(object.getSecond());
        object.setHour(14);
        System.out.println(object.getHour());
        object.setMinute(25);
        System.out.println(object.getMinute());
        object.setSecond(58);
        System.out.println(object.getSecond());
        object.setTime(0, 0, 0);
        System.out.println(object.getHour());
        System.out.println(object.getMinute());
        System.out.println(object.getSecond());
        System.out.println("presentSecond:"+ object.toString());
        System.out.println("nextSecond:"+ object.nextSecond());
        System.out.println("previoussecond:"+ object.previousSecond());
    }
}
