package com.bdg.Final;

public class Test {
    public static void main(String args[])
    {
        Student s = new Student("ABC", 101);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());

        // Uncommenting below line causes error
//         s.regNo = 102;
    }
}
