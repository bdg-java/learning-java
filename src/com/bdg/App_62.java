package com.bdg;

public class App_62 {
    public static void main(String[] args) {
        int all = 1234;

        int a = all/1000;
        int b = all%1000/100;
        int c = all%100/10;
        int d = all%10;


//        System.out.println(a+","+b+","+c+","+d);
        int sum = d + b;
        int def = all/sum;
        int sss = a + c;
        int defe = all/sss;

        if(all<5000){
            System.out.println(def);
        }else{
            System.out.println(defe);
        }
    }

}
