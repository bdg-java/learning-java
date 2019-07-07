package com.bdg.agharibyan.robertlaforebook.arrayjava.objectarray;

public class DataArray {

    private Person[] array;
    private int nElements;

    public DataArray(int maxSize){
        array = new Person[maxSize];
        this.nElements = 0;
    }

    public Person find(String searchName){
        int j;
        for(j = 0; j < nElements; j++){
            if(array[j].getLastName().equals(searchName)){
                break;
            }
        }
        if( j == nElements){
            return null;
        } else{
            return array[j];
        }
    }

    public void insert(String firstName, String lastName, int age){
        array[nElements] = new Person(firstName, lastName, age);
        nElements++;
    }

    public boolean delete(String searchName){
        int j;
        for(j = 0; j < nElements; j++){
            if(array[j].getLastName().equals(searchName)){
                break;
            }
        }
        if( j == nElements){
            return false;
        } else{
            for(int k = j; k < nElements; k++){
                array[k] = array[k+1];
            }
            nElements--;
            return true;
        }
    }

    public void display(){
        for (int j = 0; j < nElements; j++){
            array[j].displayPerson();
        }
    }

}
