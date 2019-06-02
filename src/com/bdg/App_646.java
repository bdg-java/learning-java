package com.bdg;

public class App_646 {

    public static void main(String[] args) {

        char [] array = new char []   {'a', 'b', 'a', 'c', 'a'};

        int n = 5;
        int qount = 0;

         for ( int i = 0; i < n ; i ++){

             if ( array [i] == 'a') {

                 qount ++;

                 System.out.println(qount);



             }
         }

    }
}
