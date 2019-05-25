package com.bdg.Lesson5;

public class App_650 {
    public static void main(String[] args) {
        int count = 0;

        char array [] = {'z','p','b','c', 'd'};
        char array_one [] = {'z','a','b','c' ,'m'};
        int len = array.length;

        char [] y = new char[len];

        for(int i = 0 ; i < len; i++){
           for(int k = 0; k < array_one.length; k++ ){
               if( array_one[k]== array[i]){
                   count++;
               }
           }

        }
        System.out.println(count);

    }
}
