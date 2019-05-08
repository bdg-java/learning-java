package com.bdg.exercises_21_40;

public class App_29 {
    public static void main(String args[]){
        int a = 89, b =9, c = 0;
        if(a<b && a<c){

            System.out.println(a);
            if(b<c){
                System.out.println(b);
                System.out.println(c);
            }else {
                System.out.println(c);
                System.out.println(b);
            }
        }else{
            if(b<c){
                System.out.println(b);
                if(a<c){
                    System.out.println(a);
                    System.out.println(c);
                }else {
                    System.out.println(c);
                    System.out.println(a);
                }


            }else {
                System.out.println(c);
                if(b<a){
                    System.out.println(b);
                    System.out.println(a);
                }else {
                    System.out.println(a);
                    System.out.println(b);
                }

            }
        }
    }
}
