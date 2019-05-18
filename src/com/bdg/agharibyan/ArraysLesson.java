package com.bdg.agharibyan;

public class ArraysLesson {
    /**
     * @author Ani Gharibyan
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        int[] array = IntegerArrayOperations.getDefaultArray();
        IntegerArrayOperations.displayArray(array);

        int sum = 0;
        int cout = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + array[i];
            cout = cout + 1;
        }
        System.out.println((double) sum / cout);
    }
}
