package com.bdg;

public class App_53 {
    public static void main(String[] args) {
        int all = 999;

        int a = all/100;
        int b = all%100/10;
        int c = all%10;

        System.out.println(a+","+b+","+c);

        int sum =(a+b+c);
        int k =all/sum;


        if(all>k){
            System.out.println(k);
        }else{
            System.out.println(all/c);
        }


    }
}
