package com.bdg.Lesson_Loop;

public class App_153 {
    public static void main(String[] args) {
        int n = 100;
        int number = 1;
        for(int i = 1; i<=n ; i++){
            if(n%i == 2){
                number += i;
            }
        }
        System.out.println(number);

    }

}
