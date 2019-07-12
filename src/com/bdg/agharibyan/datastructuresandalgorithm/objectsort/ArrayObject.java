package com.bdg.agharibyan.datastructuresandalgorithm.objectsort;

public class ArrayObject {

    private Person [] arrayPersons;
    private int nElements;

    public ArrayObject(int maxSize){
        arrayPersons = new Person[maxSize];
        nElements = 0;
    }

    public void insert(String name, String surname, int age){
        arrayPersons[nElements] = new Person(name, surname, age);
        nElements++;
    }

    public void display(){
        for(int i = 0; i < nElements; i++){
            arrayPersons[i].display();
        }
        System.out.println();
    }

    public void insertionSortByAge(){
        int in, out;
        for(out = 1; out < nElements; out++){
            in = out;
            Person temp = arrayPersons[out];
            while(in > 0 && arrayPersons[in-1].getAge() > temp.getAge()){
                arrayPersons[in] = arrayPersons[in - 1];
                in--;
            }
            arrayPersons[in] = temp;
        }
    }

    public void insertionSortBySurname(){
        int in, out;
        for(out = 1; out < nElements; out++){
            in = out;
            Person temp = arrayPersons[out];
            while(in > 0 && arrayPersons[in-1].getSurname().compareTo(temp.getSurname()) > 0){
                arrayPersons[in] = arrayPersons[in-1];
                --in;
            }
            arrayPersons[in] = temp;
        }
    }
}
