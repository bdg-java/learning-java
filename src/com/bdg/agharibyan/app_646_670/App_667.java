package com.bdg.agharibyan.app_646_670;

public class App_667 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char []{'z', 'A', 'z', 'a', '0', 'z', 'd'};

        int gumar = 0;
        int artadryal = 1;

        for(int i = 0; i < n; i++){
            if(array[i] == 'z') {
                gumar += i;
                artadryal *= i;
            }
        }
        System.out.print("gumar:"+ gumar +", artadryal:"+ artadryal);
    }
}
