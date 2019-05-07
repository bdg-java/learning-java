package com.bdg;

public class App_25 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 2;
        if(a+b < c || c+b < a || a+c < a){
            System.out.println("y = 1");
        }else{
            System.out.println("y = 2");
        }
    }
}
