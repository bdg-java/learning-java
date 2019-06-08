package com.bdg.agharibyan.app_271_280;

public class App_277_278_279_280 {

    public static void main (String [] args){

        int n = 9;
        char [] array = new char [] {'A', 'd', '}', '5', 'z', '%', 'Z', 'f', 'd'};
        System.out.println(array);

        for (int i = 0; i < n; i++){
            if (array[i] != 'd') {
                    System.out.print (array[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            if (i != 0 && i%2 == 0){
                System.out.print (array[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            if (array[i] > 'k'){
                System.out.print(array[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            if (array[i] != 'f'){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]);
                System.out.print(array[i]);
            }
        }
    }
}
