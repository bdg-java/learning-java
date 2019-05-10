package com.bdg;

public class App_63 {
    public static void main(String[] args) {
        int all = 2234;

        int a = all/1000;
        int b = all%1000/100;
        int c = all%100/10;
        int d = all%10;


        if(a==1 || b == 1 || c == 1 || d ==1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
