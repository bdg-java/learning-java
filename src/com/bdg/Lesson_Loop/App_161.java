package com.bdg.Lesson_Loop;

public class App_161 {
    public static void main(String[] args) {
        int number = 1;
        for(int i = 9999; i>=1000; i--){

            int n = i *26;
            if(Math.sqrt(n)%2 ==0){
                number = i;

            }
        }
        System.out.println(number);
    }
}
