package com.bdg.repetition.from271to280;

import java.util.Arrays;

public class Tasks271and274and277 {

    public static void main(String[] args) {

        int n = 10;
        char[]array = new char[]{'a','d','s','5', 'd', '%', '@', 'd', 'd', 'd'};
        System.out.println("Array is " + Arrays.toString(array));

        //Tasks271and274and277
        int quantity = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 'a'){
                quantity++;
            }
        }
        System.out.println("'a' tarreri qanak: " + quantity);

        //Task274
        quantity = 0;
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > 'h') {
                quantity++;
                sum += i;
            }
        }
        System.out.println("'h'ic mets tarreri mijin tvabanakan: " + sum/quantity);

        //Task277
        quantity = 0;
        char[] x = new char[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] != 'd'){
                quantity++;
            }
        }

        //bacardzak chem havanum storev lutsums, qani vor ayn anhatakan motecmamb lutsum e miayn im trvats arrayi hamar
        char[]newarray = new char[quantity];
        int indexd = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == 'd'){
                indexd = i;
                System.arraycopy(array,0,newarray,0,i);
                break;
            }
        }
        int indexnextd = 0;
        for(int i = indexd+1; i < array.length; i++){
            if(array[i] == 'd'){
                indexnextd = i;
                System.arraycopy(array,indexd+1,newarray,indexd,indexnextd-indexd-1);
                break;
            }
        }
        int indexnextnextd = 0;
        for(int i = indexnextd+1; i < array.length; i++){
            if(array[i] == 'd'){
                indexnextnextd = i;
                System.arraycopy(array,indexnextd+1,newarray,indexnextd-1,indexnextnextd-indexnextd-1);
                break;
            }
        }
        System.out.println("Array without element 'd' is " + Arrays.toString(newarray));
    }

}
