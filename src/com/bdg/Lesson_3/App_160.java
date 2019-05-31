package com.bdg.Lesson_3;

public class App_160 {
    public static void main(String[] args) {

       int min =  -1;

       for (int x =100; x < 1000 ;x++){
           int n = x * 16;
               if (Math.sqrt(n) % 1 == 0.0){
                  min = x;
                   break;
               }
       }
        System.out.println(min);
    }
}
