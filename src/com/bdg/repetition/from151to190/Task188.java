package com.bdg.repetition.from151to190;

public class Task188 {

    public static void main(String[] args) {

        int N = 13;
        boolean t = false;

        int [] Fib = new int[N];
        Fib[0] = 1;
        Fib[1] = 1;

        for(int i = 2; i < N ; i++){
            Fib[i] = Fib[i-2] + Fib[i-1];
            if(N == Fib[i]){
                t = true;
            }
        }

        System.out.println(t);
    }

}
