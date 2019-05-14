package com.bdg.Lesson_Loop;

public class App_173 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int N = 2;
        int H =(B-A)/N;
        System.out.println(H);

           for(int i = 1; i<=N; i++){

               System.out.println(i);
               int number = A +(i *H);
               System.out.println(number);
           }


        }

    }