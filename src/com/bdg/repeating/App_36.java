package com.bdg.repeating;

public class App_36 implements Vars {
    public static void main(String[] args) {
        if(a%2 != 1 && b%2 !=1 && c%2 != 1
                || b%2 !=1 && c%2 !=1 && d != 1
                ||  a%2 !=1 && c%2 !=1 && d != 1){
            System.out.println(2);
        }
        System.out.println(1);
    }
}
