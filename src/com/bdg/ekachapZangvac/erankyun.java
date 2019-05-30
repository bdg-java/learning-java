package com.bdg.ekachapZangvac;

public class erankyun {
    public static void main(String[] args) {
        int m = 5;
        char arr [] [] = new char [m][m];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(j>=i+1){
                    arr[i][j] = ' ';
                }
                else{
                    arr[i][j] = '*';
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

}
