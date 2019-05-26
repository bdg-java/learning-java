package com.bdg.lessonarrays;

public class App_237 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int count = 0;
        for (int i=0;i<array.length;i++) {
            if(array[i] == 0 ){
                count +=1;
            }
        }
        System.out.println(count);
    }
}
