package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_647 {
    public static void main(String[] args) {

        int n = 5;
        char [] array = new char [] {'a','b','c','b','a'};

        boolean t = false;
        char [] newarray = new char [array.length];

        for (int i = 0; i < n; i++){
            newarray[i] = array[n-1-i];
        }
        System.out.println(Arrays.toString(newarray));
        for (int i = 0; i < n; i++){
            if (array[i] == newarray[i]){
                t = true;
            } else {
                t = false;
            }
        }
        System.out.print(t);
    }
}
