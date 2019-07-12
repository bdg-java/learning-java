package com.bdg.agharibyan.datastructuresandalgorithm.objectsort;

public class ObjectSelect {

    public static void main(String[] args) {

        ArrayObject myArray = new ArrayObject(10);
        myArray.insert("Poghos", "Poghosyan", 30);       // inchu e insert methody hasaneli miayn psvm-um?
        myArray.insert("Petros", "Petrosyan", 25);
        myArray.insert("Shavarsh", "Shavarshyan", 20);
        myArray.insert("Mkhitar", "Mkhitaryan", 28);
        myArray.insert("Aram", "Aramyan", 10);
        myArray.insert("Davit", "Davtyan", 5);
        myArray.insert("Karen", "Karenyan", 22);
        myArray.insert("Manuk", "Manukyan", 18);
        myArray.insert("Vilen", "Vilenyan", 15);
        myArray.insert("Rustam", "Rustamyan", 11);

        System.out.println("Befor sorting");
        myArray.display();

        myArray.insertionSortByAge();
        System.out.println("After sorting by age");
        myArray.display();

        myArray.insertionSortBySurname();
        System.out.println("After sorting by surname");
        myArray.display();
    }
}
