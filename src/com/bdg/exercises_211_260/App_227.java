package com.bdg.exercises_211_260;

public class App_227 {

    public static void main(String[] args) {
        int[] defaultArray = IntegerArrayOperations.getDefaultArray();
        int k =24;
        int sum =0;
        int count =0;
        for (int i = 1;i<defaultArray.length;i++){
          if(k%i == 0){
              count++;
              sum+=defaultArray[i];
          }
        }
        if(count!= 0){
            System.out.println(sum/count);
        }

    }
}
