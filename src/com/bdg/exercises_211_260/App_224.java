package com.bdg.exercises_211_260;

public class App_224 {

    public static void main(String[] args) {

        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int k =45;
        int sum = 0;
        for (int i = 0;i<defaultArray.length;i++){
            if(Math.abs(defaultArray[i]) < k){
                System.out.println(defaultArray[i]);
                sum+= Math.pow(defaultArray[i],3);
            }
        }
        System.out.println(sum);

    }
}
