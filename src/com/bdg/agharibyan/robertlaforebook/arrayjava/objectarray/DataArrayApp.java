package com.bdg.agharibyan.robertlaforebook.arrayjava.objectarray;

public class DataArrayApp {

    public static void main(String[] args) {

        int maxsize = 100;
        DataArray array = new DataArray(maxsize);

        array.insert("A", "A", 1);
        array.insert("B", "B", 2);
        array.insert("C", "C", 3);
        array.insert("D", "D", 4);
        array.insert("E", "E", 5);
        array.insert("F", "F", 6);
        array.insert("G", "G", 7);
        array.insert("H", "H", 8);
        array.insert("I", "I", 9);
        array.insert("J", "J", 10);

        array.display();
        System.out.println();

        String searchKey = "E";
        Person found;
        found = array.find(searchKey);
        if (found == null){
            System.out.print("can't find " + searchKey);
        } else{
            System.out.print("found ");
            found.displayPerson();
        }

        System.out.println();

        array.delete("G");
        array.delete("H");
        array.delete("J");

        array.display();
    }
}
