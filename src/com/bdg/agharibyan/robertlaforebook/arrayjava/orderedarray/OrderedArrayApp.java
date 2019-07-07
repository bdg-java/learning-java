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

        array.delete(66);
        array.delete(0);
        array.delete(33);
        array.display();
    }
}
