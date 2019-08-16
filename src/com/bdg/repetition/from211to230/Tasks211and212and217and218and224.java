package com.bdg.repetition.from211to230;

public class Tasks211and212and217and218and224 {

    public static void main(String[] args) {

        int n = 10;
        double[] array = new double[n];

        array[0] = 9;
        array[1] = -6;
        array[2] = 0;
        array[3] = 2;
        array[4] = 7;
        array[5] = -1;
        array[6] = -5;
        array[7] = 2;
        array[8] = 5;
        array[9] = -8;

        int quantity = 0;
        int sum = 0;
        int summ = 0;

        // Task 211 & 212
        for(int i = 0; i < n; i++){
            if(array[i] > 0){
                sum += array[i];
                summ += Math.pow(array[i], 2);
                quantity++;
            }
        }
        int mijintvabanakan = sum/quantity;
        double mijinqarakusayin = Math.sqrt(summ/quantity);


        System.out.println("mijin tvabanakan: " + mijintvabanakan);
        System.out.println("mijin qarakusayin: " + mijinqarakusayin);

        //Task 217 & 218
        int artadryal = 1;
        sum = 0;
        for(int i = 1; i < n; i += 2){
            artadryal *= Math.pow(array[i],2);
            sum += Math.abs(array[i]);
        }

        System.out.println("Kent index unecogh tarreri qarakusineri artadryal: " + artadryal);
        System.out.println("Kent index unecogh tarreri bacardzak arzheqneri gumar: " + sum);

        //Task 224
        int k = 7;
        sum = 0;
        for(int i = 0; i < n; i++){
            if(Math.abs(array[i]) < k){
                sum += Math.pow(array[i],3);
            }
        }

        System.out.println("k-ic poqr bacardzak arzheqov tarreri khoranardneri gumar: " + sum);

    }

}
