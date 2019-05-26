package com.bdg.lessonarrays;

public class App_225 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int t=30;
        int product = 1;
        for (int i=0;i<array.length;i++) {
            int abs = (int) Math.abs(array[i]);
            if(abs>t){
                product *= abs ;
            }
        }
        System.out.println(product);
    }
}
