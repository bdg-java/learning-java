package com.bdg.nhakobyan.lesson_5;

public class exercise_246 {
    public static void main(String[] args) {
        int[] arr = {4, 16, 7, 0, 36, 12, 98, 3, 8, 1, 0, 9,12,45,76,87,123};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (Math.sqrt(i)% 2 == 0 || Math.sqrt(i)% 3 == 0 || Math.sqrt(i)% 5 == 0 || Math.sqrt(i)% 7 == 0  || Math.sqrt(i)% 9 == 0){
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum / count);

    }
}
