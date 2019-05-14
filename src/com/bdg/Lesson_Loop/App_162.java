package com.bdg.Lesson_Loop;

public class App_162 {
    public static void main(String[] args) {
        int number = 1;
        for(int i = 1000; i<=9999; i++){

            int n = i *14;
            if(Math.sqrt(n)%2 ==0){
                number = i;

            }
        }
        System.out.println(number);
    }
}
