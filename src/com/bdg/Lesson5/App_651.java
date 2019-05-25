package com.bdg.Lesson5;

public class App_651 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        char array [] = {'a','b','c', 'd','k','k','c','l','a'};
        int len = array.length;

        char [] y = new char[len];

        for(int i =0 ; i < len; i++){
            System.out.println(array[len-i-1]);
            if(array[i] == array[len-i-1]){
                sum++;
            }
//            y[len-i-1] = array[i];
//            if(y[i] == array[i]){
//                System.out.println(y[len-1] );
//
//                  sum++;
//
//            }
        }
        System.out.println(sum);

    }
}
