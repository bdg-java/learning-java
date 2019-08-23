package com.bdg.pastreapeat;

public class App_23 {
    public static void main(String[] args) {
        int a = 2, b = 3,c = 0;
        hasOne(a,b,c);

    }
    public static void hasOne(int ...numbers){
        boolean bool = false;
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] == 1) {
//                System.out.println(numbers[i]);
                bool = true;
            }
        }
        System.out.println(bool);
    }
}
