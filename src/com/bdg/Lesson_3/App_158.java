package com.bdg.Lesson_3;

public class App_158 {
    public static void main(String[] args) {

        long sum =1 ;

       for (int x = 100; x < 1000; x++ ){
           if ((x % 2 !=0)&&(x % 3 != 0)){
               System.out.println(x);
               sum *= x;
           }
       }
        System.out.println(sum);
    }
}
