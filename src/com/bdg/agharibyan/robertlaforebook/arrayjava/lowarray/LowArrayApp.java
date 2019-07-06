package com.bdg.agharibyan.robertlaforebook.arrayjava.lowarray;

public class LowArrayApp {

    public static void main(String[] args) {

        LowArray array = new LowArray(100);
        int j;
        int nElements;

        array.setElement(0, 11);
        array.setElement(1, 0);
        array.setElement(2, 22);
        array.setElement(3, 66);
        array.setElement(4, 44);
        array.setElement(5, 99);
        array.setElement(6, 55);
        array.setElement(7, 77);
        array.setElement(8, 33);
        array.setElement(9, 88);
        nElements = 10;

        //display
        for (j = 0; j < nElements; j++){
            System.out.print(array.getElement(j) + " ");
        }

        System.out.println();

        //find element
        long searchKey = 11;
        for(j = 0; j < nElements; j++){
            if(array.getElement(j) == searchKey){
                break;
            }
        }
        if(j == nElements){
            System.out.println("Member " + searchKey + " not found");
        } else{
            System.out.println("Member found " + searchKey + " with index " + j);
        }

        //delete found element
        if(j != nElements) {
            for (int k = j; k < nElements - 1; k++) {
                array.setElement(k, array.getElement(k + 1));
            }
            nElements--;
            for (j = 0; j < nElements; j++) {
                System.out.print(array.getElement(j) + " ");
            }
        }

    }
}

