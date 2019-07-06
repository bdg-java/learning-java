package com.bdg.agharibyan.robertlaforebook.arrayjava.higharray;

public class HighArrayApp {

    public static void main(String[] args) {

        int maxSize = 100;
        HighArray array = new HighArray(maxSize);

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

        int searchKey = 4;
        if(array.find(searchKey)){
            System.out.print("Found " + searchKey);
        } else{
            System.out.print("Can't find " + searchKey);
        }
        System.out.println();

        array.delete(0);
        array.delete(66);
        array.delete(99);

        array.display();
    }
}
