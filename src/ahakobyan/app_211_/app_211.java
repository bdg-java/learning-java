package ahakobyan.app_211_;


import ahakobyan.IntegerArrayoperations;

public class app_211 {
    public static void main(String[] args) {

        int[] array = IntegerArrayoperations.getDefaultArray();
        array = new int [6];
        System.out.println(array.length);
        int a = 0;


        for (int i = 1; i <= array.length; i++) {
            a += array[i];
            System.out.println(array[i] + "");
        }
            System.out.println("" +(double) a / array.length);
    }

}