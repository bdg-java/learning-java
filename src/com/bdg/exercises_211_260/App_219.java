package com.bdg.exercises_211_260;

public class App_219 {
    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int k =2;
        int count = 0;
        for (int i=0;i<defaultArray.length;i++){
            if(i%k == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}
