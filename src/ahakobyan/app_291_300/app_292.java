package ahakobyan.app_291_300;

import ahakobyan.IntegerArrayoperations;

import java.util.Arrays;

public class app_292 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int [] y = new int[x.length];
        int a = 0;

        for (int i =0; i <x.length; i++){
            if (x[i] % 7 != 0 ) {
                y[a] = x[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(y));
    }
}