package com.bdg.Lesson_Loop;

public class App_169 {
    public static void main(String[] args) {
        int x = 9;
        int y = 8;
        int n = x+ y;
        int sqrt = (int) Math.sqrt(n);
        int z =5;
        for(int i = 2; i<=sqrt ;i++){
            if(n%i == 0){
               z =6;
            }
        }
        System.out.println(z);


    }
}
