package com.bdg.agharibyan.app_646_670;

public class App_660 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char []{'*', '*', '*', '*', '*', '*', '*'};

        char [] newarray = new char[n];
        int k = 0;
        int j = 0;

        for(int i = 0; i < n; i++){
            if( i == 2 + 3*j) {
                newarray[k] = 'a';
                j++;
            } else {
                newarray[k] = array[i];
            }
            k++;
        }
        System.out.print(newarray);
    }
}
