package com.classehomework;

public class test {
    public static void main(String[] args) {
        Account accEd = new Account("54", "Eduard", 10000);
        Account accVah = new Account("55", "Vahe", 10000);

        System.out.println(accEd.transferTo(accVah, 100));
        System.out.println(accEd.toString());
        System.out.println(accVah.toString());
    }
}
