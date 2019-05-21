package com.bdg;

public class App_272 {

    public static void main(String[] args) {


        Boolean t = false;


        char[] text = {'a', 'b', 't', '3' , 'b', 'c', 'b', 'd' };

        int n = 0;

        int c = 0;


        for ( int i = 0; i < text.length; i++){

            if (text [i] == 'b' ) {

                c++;

                System.out.println(c);

                if (text[c] >= n/2 ) {

                    System.out.println(true);


                }


            }
        }

    }
}
