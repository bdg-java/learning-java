package com.bdg;

public class App_279 {

    public static void main(String[] args) {


        char[] a = {'a', 'u', 'a', 'q', 'b', 'c', 'p', 'd' };

        char [] b = new char[a.length];

        int n = 0;

        int c = 0;

        for ( int i = 0; i < a.length;i++){

            if (a [i] > 'k') {
                b[c] = a[i];

                c++;

                System.out.println(c);







            }
        }

    }
}


