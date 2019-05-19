package com.bdg.Lesson_5;

public class App_276 {
    public static void main(String[] args) {

        boolean t = false ;
        char [] sum = {'a', 'e', 'd', 't', 'r', 'r', 'j', 'z'};

        for (int i =0; i < sum.length; i++) {
            if (sum[i] == 'r' ){
                t=true;
                break;
            }
        }
        System.out.println(t);
    }
}
