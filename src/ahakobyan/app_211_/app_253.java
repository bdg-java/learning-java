package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_253 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        int a = x[0];
        int i;
        int b =x [0];

        for (i = 0; i < x.length; i++) {
            if (x[i] > a) {
                a = x[i];
                if (x[i] < b) {
                    b = x[i];
                }
            }
        }
        System.out.println(a +b);
    }
}