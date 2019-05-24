package com.Lesson6;

import com.lesson5.CharArrayDeclaration;

public class Task667 {
    public static void main(String[] args) {
        char[] a = CharArrayDeclaration.getDef_array();
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 'z') {
                sum += i + 1;
                mul *= i + 1;
            }
        }
        System.out.println("Sum = " + sum + " Mul " + mul);
    }
}
