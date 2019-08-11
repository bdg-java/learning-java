package com.bdg.repetition.from151to190;

public class Task168 {

    public static void main(String[] args) {

        boolean p = false;
        int n = 3;
        int x = (int)Math.sqrt(n);

        for(int i = 2; i <= x; i++){
            if(n%i != 0){
                p = true;
            } else{
                p = false;
            }
        }
        if(n == 2 || n == 3){
            p = true;
        }

        System.out.println(p);
    }

}
