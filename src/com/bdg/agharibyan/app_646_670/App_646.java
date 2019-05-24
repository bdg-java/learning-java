package com.bdg.agharibyan.app_646_670;

public class App_646 {
    public static void main(String [] args){

        int n = 5;
        char [] array = new char []{'a', 'b', 'a', 'c', 'A'};

        int qanak = 0;

        for ( int i = 0; i < n; i++){
            if ( array[i] == 'a'){
                qanak++;
            }
        }
        System.out.print(qanak);
    }
}
