package com.bdg.lessonarrays;

public class App_249 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int k = 0;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            int diff = array[i]-i;
            if(((int) Math.abs(diff))>k) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
