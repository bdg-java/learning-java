package com.bdg;

public class App_273 {

    public static void main(String[] args) {


        char [] text = { 'a', 's' , 't' , 's' };

        int c = 0;
        int sum = 0;



        for ( int i = 0; i < text.length; i++){

        if ( text[i] == 's') {

            c++;

            sum += i;



            System.out.println(sum);


        }
        }
        }
}
