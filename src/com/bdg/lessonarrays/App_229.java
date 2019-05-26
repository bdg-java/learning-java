package com.bdg.lessonarrays;

public class App_229 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int product = 1;
        for (int i=0;i<array.length;i++) {
            if(array[i]-i > 0){
                product += array[i];
            }
        }
        System.out.println(product);
    }
}
