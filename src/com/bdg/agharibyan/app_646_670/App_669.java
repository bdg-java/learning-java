package com.bdg.agharibyan.app_646_670;

public class App_669 {
    public static void main(String[] args) {

        int n = 4;
        char [] array = new char []{'a', 'b', 'c', 'b', '2', 'b', 'c', 'b', 'a'};

        int k = 0;
        boolean t = false;
        int qanak = 0;

        for(int i = 0; i < 2*n + 1; i++){
            if(array[i] == array[array.length - 1 - k]){
                t = true;
            } else{
                t = false;
            }
            k++;
        }
        if(t == true){
            for(int i = 0; i < array.length; i++){
                if(array[i] == 'a'){
                    qanak++;
                }
            }
        } else{
            for(int i = 0; i < array.length; i++){
                if(array[i] == 'b'){
                    qanak++;
                }
            }
        }
        System.out.print(qanak);
    }
}
