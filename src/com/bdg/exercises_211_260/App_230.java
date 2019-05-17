package com.bdg.exercises_211_260;

public class App_230 {
    public static void main(String[] args) {
        int k=800;
        double result =0;
        int count = 0;
        int[] array = IntegerArrayOperations.getDefaultArray();
        for (int i=0;i<array.length;i++){
            if(k%array[i] == 0){
                count++;
                result+=Math.pow(array[i],2);
            }
        }
        System.out.println(result/count);
    }

}
