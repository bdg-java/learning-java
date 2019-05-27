package com.bdg.agharibyan.app_646_670;

public class App_664 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char []{'d', 'A', 'c', 'a', '0', 'c', 'c'};

        int qanak = 0;
        boolean t = false;

        for(int i = 0; i < n; i++){
            if(array[i] > 'c'){
                t = true;
            }
        }
        if(t == true){
            for(int i = 0; i < n; i++){
                if(array[i] == 'c'){
                    qanak++;
                }
            }
        } else {
            for(int i = 0; i < n; i++){
                qanak = 0;
                if(array[i] == 'd'){
                    qanak++;
                }
            }
        }
        System.out.print(qanak);
    }
}
