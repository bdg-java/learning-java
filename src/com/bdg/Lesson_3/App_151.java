package com.bdg.Lesson_3;

    public class App_151 {
        public static void main(String[] args) {

           int n = 4;
           int num = 15;
           int sum = 0;

           for (int x = 1 ; x <= num ; x++){
               if (x % n ==0 ){
                   System.out.println(x);
                   sum+=x;
                }
             }
            System.out.println(sum);
        }
    }


