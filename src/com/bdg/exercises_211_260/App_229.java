package com.bdg.exercises_211_260;

public class App_229 {

    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int multiply = 1;
        for (int i=0;i<defaultArray.length;i++){
            if(defaultArray[i] - i > 0){
                multiply*=defaultArray[i];
            }
        }
        System.out.println(multiply);
    }
}
