package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_655 {

    public static void main(String[] args) {

        int n = 3;
        char [] array = new char []{'0', 'A', 'z', 'a', '0', 'o', 'a'};

//        char [] newarray = new char [2*n + 1];
//        int k = 2*n;
//
//        for(int i = 0; i < 2*n+1; i++){
//            newarray[k] = array[i];
//            k--;
//        }
//        System.out.print(Arrays.toString(newarray));

        char [] newarray = new char [2*n + 1];

        for(int i = 0; i < 2*n +1; i++){
            newarray[i] = array[2*n-i];
        }
        System.out.print(Arrays.toString(newarray));
    }
}
