package com.bdg;

public class App_52 {
    public static void main(String[] args){
        boolean t = true;

        int all = 135;

        int a = all/100;
        int b = all%100/10;
        int c = all%10;

        System.out.println(a +","+b+","+c);

        if((a + b) == c || (a + c) == b || (c + b) == a){
             t = true;
        }else{
            t = false;
        }

        System.out.println(t);







    }
}
