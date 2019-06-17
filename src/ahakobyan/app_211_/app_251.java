package ahakobyan.app_211_;


import ahakobyan.IntegerArrayoperations;

public class app_251 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        int a =x[0];
        int i;

        for (i = 0; i < x.length; i++) {
            if (x[i] > a){
                a= x[i];
            }
        }
        System.out.println(a);
    }
}
