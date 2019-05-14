package com.bdg.Lesson_Loop;

public class App_158 {
    public static void main(String[] args) {
        int number = 1;

        for(int i=100; i<=999; i++){
            if(i%2 !=0 && i%5 !=0){
                number *=i;
            }
        }
        System.out.println(number);
    }
}
