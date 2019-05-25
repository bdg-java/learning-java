package com.bdg.Lesson5;

public class App_652 {
    public static void main(String[] args) {
        char sum ;

        char array [] = {'z','p','b','c', 'd'};
        char array_one [] = {'z','a','b','c' ,'m'};
        int len = array.length;

        for(int i = 0; i < len; i++ ) {
            for(int k = 0; k < array_one.length; k++)
                if (array[i] == array_one[k]) {
                    sum = array_one[k];
                    char [] y = new char []{sum};
                    for(int j = 0; j < y.length; j++) {
                        System.out.println(y[j]);
                    }

                }
        }


    }
}
