package com.bdg.lessonarrays;

public class App_248 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getOneDigitNumberArray();
        IntegerArrayOperations.displayArray(array);

        int k = 3;
        int sum = 0;
        int count = 0;
        for (int i=0;i<array.length;i++) {
            int sum2 = array[i]+i;
            if(((int) Math.pow(sum,2))%k == 0) {
                sum+=array[i];
            }
        }
        System.out.println(sum);
    }
}
