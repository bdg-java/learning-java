package com.bdg.agharibyan.app_646_670;

public class App_648 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char [] {'0','x','0','a','*','0','0'};

        int qanak = 0;

        for (int i = 0; i < n; i++){
            if(array[i] == 'x'){
                for(int k = i; k < n; k++){
                    if(array[k] == '0'){
                        qanak++;
                    }
                }
            }
        }
        System.out.print(qanak);
    }
}
