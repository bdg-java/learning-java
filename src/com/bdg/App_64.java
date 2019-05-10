package com.bdg;

public class App_64 {
    public static void main(String[] args) {
        int all = 1541;

        int a = all/1000;
        int b = all%1000/100;
        int c = all%100/10;
        int d = all%10;
        int t =  c + d;

        if(t == 5){
           char  y = 's';
            System.out.println(y);
        }else{
            char y = 'd';
            System.out.println(y);
        }


    }
}
