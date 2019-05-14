package com.bdg.Lesson_Loop;

public class App_156 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 10; i <= 99; i++) {
            if(i%3 == 0 && i%5 == 0){
                number *= i;
            }
        }
        System.out.println(number);
    }
}
