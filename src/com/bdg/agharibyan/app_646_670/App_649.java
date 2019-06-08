package com.bdg.agharibyan.app_646_670;

public class App_649 {
    public static void main(String[]args){

        int n = 7;
        char [] array = new char [] {'0','A','z','a','*','0','z'};

        int qanak = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++){
            if(array[i] == 'z'){
                x = i;
                break;
            }
        }

        for (int i = x+1; i < n; i++){
            if(array[i] == 'z'){
                y = i;
            }
        }

        for(int i = x+1; i < y; i++){
            qanak ++;
        }
        System.out.print(qanak);
    }
}
