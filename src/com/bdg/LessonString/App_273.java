package com.bdg.LessonString;

public class App_273 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        char na [] = {'a','b','s','d','s','a'};

        for(int i=0; i<na.length;i++){
            if(na[i] == 's') {
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
