package com.bdg.agharibyan.app_271_280;

public class App_274_275_276 {

    public static void main (String [] args){

        int n = 9;
        char [] array = new char []{'h','z','d','*','0',',','K','d','}'};
        int gumar = 0;
        int qanak = 0;

        for ( int i = 0; i < n; i++){
            if (array[i] > 'h'){
                gumar += i;
                qanak ++;
            }
        }
        System.out.println("h_ic mets arzheq unecogh tarreri indexneri mijin tvabanakan:"+ (double)gumar/qanak);

        int x = 0;
        for (int i = 0; i < n; i++){
            if (array[i] < 'k'){
                x++;
            }
        }
        System.out.println("k_ic poqr arzheq unecogh tarreri qanak:"+ x);

        boolean t = false;

        for (int i = 0; i < n; i++){
            if (array[i] == 'r'){
                t = true;
            }
        }
        System.out.println("r tarri arkayutyan chshtum:"+ t);
    }
}
