package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_662 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char[]{'5', '1', '4', '3', '2', '3', '5'};
        char givenElement = '3';

        char [] newArray = new char[n];
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(array[i] > givenElement){
                newArray[j] = array[i];
                j++;
            }
        }
        for(int i = 0; i < n; i++) {
            if(array[i] == givenElement){
                newArray[j] = array[i];
                j++;
            }
        }
        for(int i = 0; i < n; i++) {
            if(array[i] < givenElement){
                newArray[j] = array[i];
                j++;
            }
        }

        System.out.print(Arrays.toString(newArray));
    }
}