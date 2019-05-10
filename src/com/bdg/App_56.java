package com.bdg;

public class App_56 {
    public static void main(String[] args) {

        int all = 897;

        int a = all / 100;
        int b = all % 100 / 10;
        int c = all % 10;

        System.out.println(a + "," + b + "," + c);

        int t = a + b + c;
        int k = t/all;

        if(c > b){
            System.out.println(all);
        }else {
            System.out.println(k);
        }


    }
}
