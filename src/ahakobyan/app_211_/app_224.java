package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_224 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        int t = 16;
        int a = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < t) {
                a++;
            }
        }
        System.out.println(a);
    }
}