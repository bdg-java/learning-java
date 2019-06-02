package com.bdg;

public class App_650 {

    public static void main(String[] args) {

        char [] array1 = new char [] {'a', 'z', 'c', 'd', 'r', 'e' , 'z' };
        char [] array2 = new char [] { 'b', 's', 'f', 'd', 'r', 'r' , 'e'  };

        int n = 7;
        int qount = 0;

        for ( int i = 0; i < n; i++){
            for (int k = 0; k < n ; k++){

                if ( array1 [i] == array2 [k]){

                    qount ++;

                    System.out.println(qount);

                }
            }
        }
    }
}
