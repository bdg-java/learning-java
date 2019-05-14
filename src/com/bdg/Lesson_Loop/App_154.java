package com.bdg.Lesson_Loop;

public class App_154 {
    public static void main(String[] args) {
        int n = 222;
        int number = 1;
        for (int i=1; i<=n; i++){
            if(n%i == 3){
                number = number + i;
            }
        }
        System.out.println(number);
    }
}
