package com.bdg;

public class App_34 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        if(a+b == c+d){
            if(a+c == b+d){
                System.out.println(true);
            }else {
                System.out.println(true);
            }
        }else{
            if(a+d == c+b){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
