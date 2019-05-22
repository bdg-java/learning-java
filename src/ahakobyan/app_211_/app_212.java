package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_212 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        x = new int[6];
        System.out.println(x.length);
        double a = 1;
        int i;

        for (i = 1; i <= x.length; i++) {
            if (x[1] > 0) {
                a = x[i] * x[i];
            }
            a = Math.sqrt(a / i);
            System.out.println(a);
        }
    }
}