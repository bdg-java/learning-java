package com.bdg.exercises_211_260;

public class App_226 {

    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int k =23;
        int count =0;
        for (int i = 0;i<defaultArray.length;i++){
            if(Math.abs(defaultArray[i]) < k){
              count++;
            }
        }
        System.out.println(count);
    }
}
