package com.bdg.lessonarrays;

public class App_250 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);


        int product = 1;
        for (int i=0;i<array.length;i++) {
            int product1 = array[i]*i;
            if(product1%3 == 2) {
                int square = (int) Math.pow(array[i],2);
                product*=square;
            }
        }
        System.out.println(product);

    }
}
