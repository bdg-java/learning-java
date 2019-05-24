package ahakobyan.app_291_300;

import ahakobyan.IntegerArrayoperations;

import java.util.Arrays;

public class app_297 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int k = 5;
        int a = 0;
        int b = 0;

        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i]) > k) {
                a++;
            }
            int [] y = new int[a];
            for (i = 0; i < x.length; i++){
                if (Math.abs(x[i] ) <= k) {
                    y[b] = x[i];
                    b++;
                }
            }
            System.out.println(Arrays.toString(y));
        }
    }
}
