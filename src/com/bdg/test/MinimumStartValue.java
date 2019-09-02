package com.bdg.test;

public class MinimumStartValue {

    private static int x = 11;
    private static int[] arr = {-9, 5, 0, 1, -1, 6, 1, -3, 15, 30};

    public static void main(String[] args) {

        int[] array = new int[arr.length];
        int min = x;

        if (arr.length >= 1 && arr.length <= Math.pow(10, 5)) {
            boolean isConstrainValid = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < -100 || arr[i] > 100) {
                    System.out.println("Array element is not valid.");
                    isConstrainValid = false;
                    break;
                }
            }
            if(isConstrainValid){
                for(int j = 0; j < arr.length; j++){
                    x += arr[j];
                    array[j] = x;
                    if(x < 1){
                        System.out.println("sum < 1 -> Constrain is not valid");
                        break;
                    } else{
                        if(x < min){
                            min = x;
                        }
                    }
                }
                if(array[array.length - 1] > 0){
                    System.out.println("MIN sum element is " + min);
                }
            }
        }
    }
}
