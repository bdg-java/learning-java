package com.bdg.repeating;

public class App_24 implements Vars {
    public static void main(String[] args) {
        boolean result = false;
        if (a == 2 && b == 2) {
           result = true;
        }else if(a == 2 && c==2){
            result = true;
        }else if(b== 2 && c ==2){
            result = true;
        }

        System.out.println(result);
    }

}
