package com.bdg.exercises_211_260;

public class App_246 {

    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int count = 0;
        int sum =0;
        for (int i=0;i<array.length;i++){
            if(Math.pow(Math.sqrt(i),2) == i){
                count++;
                sum+=array[i];
            }
        }
        System.out.println(sum/count);
    }
}
