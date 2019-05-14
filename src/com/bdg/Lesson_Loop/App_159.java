package com.bdg.Lesson_Loop;

public class App_159 {
    public static void main(String[] args) {
        int number = 1;
        for(int i = 100; i<=999; i++){
            if(i%3 == 1 && i%4 ==2){
                number += i;
            }
        }
        System.out.println(number);
    }
}
