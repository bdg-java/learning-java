package com.bdg.Lesson_3;

public class App_157 {
    public static void main(String[] args) {

        int sum = 0;

           for (int x =100 ; x <1000 ; x++ ){
               if (x % 5 == 0){
                   System.out.println(x);
                   sum += x;
               }
           }
        System.out.println(sum);
    }
}
