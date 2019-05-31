package com.bdg.Lesson_6;

public class App_452 {
    public static void main(String[] args) {

        int[][] x = {{5, 6, 3, 8},
                {12, 5, 55, 6},
                {7, 35, 52, 2},
                {3, -5, 11, 6}};
        int m =0;
        int n =0;

        for (int i = 0; i< x.length;i++){
            m = x[0][0] *x[0][0];
            n = x [i][ x.length - 1] * x [i][ x.length - 1];
        }
        System.out.println(m +n);
    }
}
