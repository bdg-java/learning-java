package com.bdg;

public class App_648 {

    public static void main(String[] args) {

        char[] array = new char[]{'1', 'x', '0', '0', '1'};
        int n = 5;
        int qount = 0;

        for (int i = 0; i < n; i++) {

            if (array[i] == 'x') {

                for (int k = 0; k < n; k++) {

                    if (array[k] == 0) {

                        qount++;

                        System.out.println(qount);


                    }
                }


            }
        }
    }
}


