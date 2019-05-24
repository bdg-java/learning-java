package ahakobyan.app_291_300;

import ahakobyan.IntegerArrayoperations;

import java.util.Arrays;

public class app_291 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int b = 0;
        int a = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0 ){
                a++;
            }
            int [] y = new int[a];
            for (i = 0; i <y.length; i++){
                if (x[i] < 0){
                    y[b] = x[i];
                    b++;
                }
            }
            System.out.print(Arrays.toString(y));
        }
    }
}
