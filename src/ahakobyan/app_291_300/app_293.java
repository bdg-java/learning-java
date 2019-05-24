package ahakobyan.app_291_300;

import ahakobyan.IntegerArrayoperations;

import java.util.Arrays;

public class app_293 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int [] y = new int[x.length];
        int a = 4;
        int b = 15;
        int c= 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > a && x[i] <b) {
                y[c] = x[i];
                c++;
            }
        }
        System.out.println(Arrays.toString(y));
    }
}
