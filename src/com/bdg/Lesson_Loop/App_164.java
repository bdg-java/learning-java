package com.bdg.Lesson_Loop;

public class App_164 {
    public static void main(String[] args) {
        int n = 30;
        int number = 1;
        for(int i = 999; i>=100;i--){
           if(Math.sqrt(i) > n){
               number = i;
           }
        }
        System.out.println(number);
    }
}
