package com.bdg.Lesson_4;

public class App_256 {
       public static void main(String[] args) {
        int z = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
                z +=1;
        }
        System.out.println(min * z);

    }
}
