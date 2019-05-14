package com.lesson3;

public class Task176 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n = 10;
        System.out.println("1 : " + n1 + "\n" + "2 : " + n2);
        for (int i = 3; i <= n; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(i + " : " + n3);
        }
    }
}
