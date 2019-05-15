package com.bdg.exercises_151_210;

public class App_208 {
    public static void main(String[] args) {
        int n = 666;
        boolean t = false;
        int num;
        int count = 0;
        int sum =0;
        for (int i = 10; true; i *= 10) {
          count++;
            num = n % i / (i / 10);
            sum+= num;
            if (n / i == 0) {
                break;
            }
        }
        if(num*count == sum){
            t = true;
        }

        System.out.println(t);
    }
}
