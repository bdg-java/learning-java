package com.bdg.Lesson_Loop;

public class App_166 {
    public static void main(String[] args) {
        int n =64;
        int y = -1;
        for(int i = 1; i<n; i++){
            if(n%4 != 0){
               y = 0;
            }else{
                y = 1;
            }
        }
        System.out.println(y);


    }
}
