package com.bdg.repeating;

public class App_185 {
    public static void main(String[] args) {
        int p =25;
        int money = 30000;
        int res = p*money/100;
        int count = 0;
        int sum = 0;
        System.out.println(res);
        for(sum=30000; sum< 100000; ) {
            sum += res;
            count++;
        }

        System.out.println("months " +" " + count + " result " + sum);
    }
}
