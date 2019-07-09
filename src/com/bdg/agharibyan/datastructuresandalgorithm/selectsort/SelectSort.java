package com.bdg.agharibyan.datastructuresandalgorithm.selectsort;

public class SelectSort {
    public static void main(String[] args) {

        ArraySelect array = new ArraySelect(10);

        array.insert(15);
        array.insert(9);
        array.insert(19);
        array.insert(5);
        array.insert(13);
        array.insert(7);
        array.insert(11);
        array.insert(3);
        array.insert(17);
        array.insert(1);

        array.display();
        array.selectSort();
        System.out.println("After SelectSort");
        array.display();
    }
}
