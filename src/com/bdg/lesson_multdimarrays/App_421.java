package com.bdg.lesson_multdimarrays;

public class App_421 {
    public static void main(String[] args) {
        int[][] array = MultDimArrays.getDefaultArray();
        int k = 2;
        int count = 0;

        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array.length;j++) {
                if(i>j && array[i][j]%k==0) {
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
