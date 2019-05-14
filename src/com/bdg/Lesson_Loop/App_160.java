package com.bdg.Lesson_Loop;

public class App_160 {
    public static void main(String[] args) {
        int number = 1;
        for(int i = 999; i>=100; i--){
            int n = i *16;
            if(Math.sqrt(n)%2 ==0){
              number = i;

            }
        }
        System.out.println(number);

    }
}
