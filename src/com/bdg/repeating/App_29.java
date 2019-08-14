package com.bdg.repeating;

public class App_29 implements Vars {
    public static void main(String[] args) {
        if(a>b && a>c){
            if(b > c){
                System.out.println(a + " " + b + " " + c);
            }else{
                System.out.println(a + " " + c + " " + b);
            }
        }else if(b>a && b>c){
            if(c>a){
                System.out.println(b + " " + c + " " + a);
            }else{
                System.out.println(b + " " + a + " " + c);
            }
        }else{
            if(b>a){
                System.out.println(c + " " + b + " " + a);
            }else{
                System.out.println(c + " " + a + " " + b);
            }
        }
    }

}
