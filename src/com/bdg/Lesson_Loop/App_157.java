package com.bdg.Lesson_Loop;

public class App_157 {
    public static void main(String[] args) {
        int number = 1;
        for(int i=100; i<=999; i++){
            if(i%5 != 0){
                number += i;
            }
        }
        System.out.println(number);

    }
}
