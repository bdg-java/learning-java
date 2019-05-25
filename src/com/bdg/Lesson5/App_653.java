package com.bdg.Lesson5;

public class App_653 {
    public static void main(String[] args) {
        int count = 0;
        char array [] = {'a','b', 'c', 'd','o','k','c','a'};
        int len = array.length;

        for(int i = 0; i < len; i++ ){
            if (array[i] == 'a') {
                count++;
            }
        }


        int newArrLength = len + count;

        char[] newArr = new char[newArrLength];

        int k = 0;
        for (int j = 0; j < len; j++) {
            if (array[j] == 'a') {
                array[j] += 'c';
                newArr[k] = array[j];
                k++;
                newArr[k] = array[j];
            } else {
                newArr[k] = array[j];

            }
            k++;
        }
        System.out.println(newArr);
    }
}
