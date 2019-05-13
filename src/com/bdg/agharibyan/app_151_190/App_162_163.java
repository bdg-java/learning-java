package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_162_163 {
    public static void main(String[]args){

         int max162 = -1;

         for (int i = 1000; i<=9999; i++){
             if (Math.sqrt(i*14)%2==0){
                 max162 = i;
             }
         }
         System.out.println(max162);

// App_163
        int max163 = -1;

        for (int i = 1000; i<=9999; i++){
            if (Math.sqrt(i*18)%2==0){
                max163 = i;
            }
        }
        System.out.println(max163);

    }
}
