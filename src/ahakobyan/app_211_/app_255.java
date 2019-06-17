package ahakobyan.app_211_;


import ahakobyan.IntegerArrayoperations;

public class app_255 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        int a =0;
        int b = x[0];
        int i;

        for (i = 0; i < x.length; i++){
            if (x[i] > b) {
                b = x[i];
                a = a+ 1;
            }
        }
        System.out.println(a +b);
    }
}
