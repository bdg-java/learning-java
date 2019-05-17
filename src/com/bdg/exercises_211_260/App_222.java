package com.bdg.exercises_211_260;

public class App_222 {

    public static void main(String[] args) {
        int c= 6;
        int d =8;
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int multiply = 1;
        for (int i=c;i<d;i++){
            multiply*= defaultArray[i];
        }
        System.out.println(multiply);
    }
}
