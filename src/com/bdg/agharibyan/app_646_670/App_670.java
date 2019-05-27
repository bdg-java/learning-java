package com.bdg.agharibyan.app_646_670;

public class App_670 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char []{'1', '7', '2', '5', '6', '3', '4'};

        int qanak = 0;

        for(int i = 1; i < n-1; i++){
            if(array[i] > array[i-1] && array[i] > array[i+1]){
                qanak++;
            }
        }
        System.out.print(qanak);
    }
}
