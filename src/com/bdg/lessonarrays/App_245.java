package com.bdg.lessonarrays;

public class App_245 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        for (int i=0;i<array.length;i++) {
            if((array[i]+i)%3 == 0 ){
                int square = (int) Math.pow(array[i],2);
                sum+=square;
            }
        }
        System.out.println(sum);
    }
}
