package com.bdg.agharibyan.app_646_670;

public class App_663 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char []{'d', 'A', 'c', 'a', '0', 'c', 'd'};

        int qanak = 0;
        int gumar = 0;

        for(int i = 0; i < n; i++){
            if(array[i] == 'c'){
                qanak++;
                gumar += i;
            }
        }
        System.out.print((double)gumar/qanak);
    }
}
