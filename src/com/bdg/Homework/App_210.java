package com.bdg.Homework;

public class App_210 {
    public static void main(String[] args) {

        int N = 44444;
        int x = 0;
        int y = 0;
        boolean t = false;

        for(int i = 1; i <= N; i *= 100){
            x += N/i%10;
        }
        for(int i = 10; i <= N; i *= 100){
            y += N/i%10;
        }
        if(x == y){
            t =true;
        }
        System.out.println(t);
    }

}
