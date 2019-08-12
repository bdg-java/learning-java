package com.bdg.repetition.from201to210;

public class Task210 {

    public static void main(String[] args) {

        int N = 20790000;
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
