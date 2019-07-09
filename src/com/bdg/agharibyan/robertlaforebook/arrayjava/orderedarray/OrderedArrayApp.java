package com.bdg.agharibyan.robertlaforebook.arrayjava.orderedarray;

public class OrderedArrayApp {
    public static void main(String[] args) {

        int maxSize = 100;
        OrderedArray array = new OrderedArray(maxSize);

        array.insert(11);
        array.insert(0);
        array.insert(22);
        array.insert(66);
        array.insert(44);
        array.insert(99);
        array.insert(55);
        array.insert(77);
        array.insert(33);
        array.insert(88);

        array.display();
        System.out.println();

        long searchKey = 66;
        if(array.find(searchKey) == array.size()){
            System.out.println( searchKey + " can't find");
        } else{
            System.out.println(searchKey + " found");
        }

        System.out.println("After deletion some elements");
        array.delete(66);
        array.delete(33);
        array.delete(0);

        array.display();
        System.out.println();

        OrderedArray firstArray = new OrderedArray(10);
        OrderedArray secondArray = new OrderedArray(5);
        firstArray.insert(0);
        firstArray.insert(5);
        firstArray.insert(6);
        firstArray.insert(8);
        firstArray.insert(9);
        firstArray.insert(11);
        firstArray.insert(15);
        firstArray.insert(17);
        firstArray.insert(18);
        firstArray.insert(20);
        secondArray.insert(1);
        secondArray.insert(2);
        secondArray.insert(4);
        secondArray.insert(7);
        secondArray.insert(10);

        System.out.println("first array ");
        firstArray.display();
        System.out.println();
        System.out.println("second array ");
        secondArray.display();
        OrderedArray.merge(firstArray,secondArray);

    }
}
