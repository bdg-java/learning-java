package com.bdg.lessonarrays;

public class App_219 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int k=7;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(i%k == 0 ){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
