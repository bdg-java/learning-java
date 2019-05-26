package com.bdg.lessonarays_2;

public class App_272 {
    public static void main(String[] args) {
        char[] array = SetCharArray.getSpecificCharArray();
        SetCharArray.displayArray(array);

        boolean t = true;
        int n = array.length;
        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] == 'b') {
                count++;
            }
        }  if (count==n/2) {
                t=true;
                System.out.println(t);
            } else {
                t= false;
                System.out.println(t);
        }
    }
}
