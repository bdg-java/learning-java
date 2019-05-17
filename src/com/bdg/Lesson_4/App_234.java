package com.bdg.Lesson_4;

public class App_234 {
    public static void main(String[] args) {

        int [] a = IntegerArrayoperations.getDefaultArray();
        int sum = 0;
        int z = 0;

        for (int i = 1 ;i < a.length ; i++){
            if ((a[i] & 1) !=0 && a[i] !=0){
                System.out.println(a[i]);
                sum += a[i];
                z +=1;
            }
        }
        System.out.println(sum /z);
    }
}
