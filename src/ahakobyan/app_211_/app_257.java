package ahakobyan.app_211_;


import ahakobyan.IntegerArrayoperations;

public class app_257 {
    public static void main(String[] args) {

        int [] x = IntegerArrayoperations.getDefaultArray();
        int a= x[0];
        int b = 0;

        for (int i = 0; i <x.length; i++) {
            if (x[i] > a) {
                a = x[i];
                b = i;
            }
        }
        System.out.println(b);
    }
}
