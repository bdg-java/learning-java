package com.bdg.Lesson_Loop;

public class App_168 {
    public static void main(String[] args) {

            int n = 31;
            int sqrt = (int) Math.sqrt(n);
            boolean p = true;
            for(int i = 2; i<=sqrt ;i++){
                if(n%i == 0){
                     p = false;
                }
            }
            System.out.println(p);





        }
    }

