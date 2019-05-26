package com.bdg.lessonarrays;

public class App_238 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int count = 0;
        int sum = 0;
        for (int i=0;i<array.length;i++) {
            if(array[i]%3 == 0 ){
                int square = (int) Math.pow(array[i],2);
                sum+=square;
                count+=1;
            }
        }
        System.out.println((double) Math.sqrt(sum/count));
    }
}
