package com.bdg.Lesson_4;

public class App_211 {
    public static void main(String[] args) {

        int [] x = IntegerArrayoperations.getDefaultArray();
        int sum =0;
        double z =0;

        for (int i = 0 ; i < x.length; i++){
            if (x[i] > 0){
                System.out.println(x [i]);
                sum += x[i];
                z += 1;
            }
        }
        System.out.println(sum /z);
    }
}
