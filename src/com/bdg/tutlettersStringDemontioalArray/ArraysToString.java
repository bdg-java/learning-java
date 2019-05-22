package com.bdg.tutlettersStringDemontioalArray;
import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class ArraysToString {
    public static void main(String[] args) {
        boolean[] boolArr = new boolean[] { true, true, false, true };
        byte[] byteArr = new byte[] { 10, 20, 30 };
        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };
        double[] dblArr = new double[] { 1, 2, 3, 4 };
        float[] floatArr = new float[] { 1, 2, 3, 4 };
        int[] intArr = new int[] { 1, 2, 3, 4 };
        long[] lomgArr = new long[] { 1, 2, 3, 4 };
        Object[] objArr = new Object[] { 1, 2, 3, 4 };
        short[] shortArr = new short[] { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(dblArr));
    }
}
