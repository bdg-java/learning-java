package com.bdg;

public class App_24 {
    public static void main(String[] args){
        int a = 0;
        int b = 2;
        int c = 2;

        if (a == 2) {
            if(a == b){
                System.out.println(true);
            }else if(a == c){
                System.out.println(true);
            }else{
               System.out.println(false);
            }
        }else if(c == 2){
            if(c == b){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }else{
            System.out.println(false);
        }

    }
}
