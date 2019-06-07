package com.lesson9;

public class HierarInheritancePersonStaffStudent {
    public static void main(String[] args) {
        Person p = new Person("Mari", "Abovyanst");
        Person p1 = new Student("Irina", "Andraniki 49", "medical", 6, 800);
        Staff s = new Staff("Irina", "Andraniki", "149", 65);
        System.out.println(p);
        System.out.println(p1);
        System.out.println(s);

    }
}
