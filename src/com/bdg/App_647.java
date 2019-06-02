package com.bdg;

public class App_647 {

    public static void main(String[] args) {

        char [] array = new char [] { 'a' , 'b', 'a' , 'b',  'a'};

        boolean t = false;
        char [] newarray = new char [array.length];

        int n = 5;

        for (int i = 0; i < n; i++)

            newarray [i] = array [n-1-i];

            System.out.println(newarray);

            for ( int i = 0; i < n ; i++){

                if (array[i] == newarray [i]) {

                    t = true;

                } else {


                    t = false;
                }

                System.out.println( t );


            }
        }


    }

