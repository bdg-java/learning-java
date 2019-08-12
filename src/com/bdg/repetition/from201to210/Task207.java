package com.bdg.repetition.from201to210;

public class Task207 {

    public static void main(String[] args) {

        int N = 20790060;
        boolean t = false;

        for(int i = 1; i <= N; i *= 10){
            if(N/i%10 == 2){
                t = true;
            }
        }

        System.out.println(t);
    }

}
