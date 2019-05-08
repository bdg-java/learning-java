package com.bdg.exercises_21_40;

public class App_39 {
    public static void main(String args[]){
        int a = 37, b = 59, c = 55, d = 96;
        if(a<b){
            if(b<c){
                if(c<d){
                    System.out.println(a+","+b+","+c+","+d);
                }else {
                    System.out.println(a+","+b+","+d+","+c);
                }
            }else {
                System.out.println(a+","+c+","+b+","+d);
            }
        }else {
            if(b<c){
                if(b<d){
                    System.out.println(d+","+c+","+b+","+d);
                }


            }
        }

    }
}
