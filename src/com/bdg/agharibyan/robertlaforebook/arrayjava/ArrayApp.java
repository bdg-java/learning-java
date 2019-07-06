package com.bdg.agharibyan.robertlaforebook.arrayjava;

public class ArrayApp {

    public static void main(String[] args) {

        long[] array;
        array = new long[100];
        int j;
        int nElements;
        long searchKey;

        array[0] = 11;
        array[1] = 0;
        array[2] = 22;
        array[3] = 66;
        array[4] = 44;
        array[5] = 99;
        array[6] = 55;
        array[7] = 77;
        array[8] = 33;
        array[9] = 88;
        nElements = 10;

        //display array
        for(j = 0; j < nElements; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();

        //search element
        searchKey = 8;
        for(j = 0; j < nElements; j++){
            if(array[j] == searchKey){
                break;
            }
        }
        if( j  == nElements){
            System.out.println("Can't find " + searchKey);
        }
        else{
            System.out.println("Found " + array[j] + " with index " + j);
        }

        //delete element
        searchKey = 8;
        for(j = 0; j < nElements; j++) {
            if(array[j] == searchKey) {
                break;
            }
        }
        for (int k = j; k < nElements - 1; k++) {
            array[k] = array[k + 1];
        }
        if(j != nElements) {
            nElements--;
            System.out.println("Deletion " + searchKey + " is done" );
            for (j = 0; j < nElements; j++) {
                System.out.print(array[j] + " ");
            }
        } else{
            System.out.println("Deletion " + searchKey + " isn't done, because it isn't in our array");
        }
    }
}
//package com.bdg.agharibyan.laforerobertbook.arrayjava;
//
//public class ArrayApp {
//
//    public static void main(String[] args)
//    {
//        long[] arr; // Ссылка на массив
//            arr = new long[100]; // Создание массива
//        int nElems = 0; // Количество элементов
//        int j; // Счетчик цикла
//        long searchKey; // Ключи искомого элемента
////--------------------------------------------------------------
//        arr[0] = 77; // Вставка 10 элементов
//        arr[1] = 99;
//        arr[2] = 44;
//        arr[3] = 55;
//        arr[4] = 22;
//        arr[5] = 88;
//        arr[6] = 11;
//        arr[7] = 00;
//        arr[8] = 66;
//        arr[9] = 33;
//        nElems = 10; // Массив содержит 10 элементов
////--------------------------------------------------------------
//        for(j=0; j<nElems; j++) // Вывод элементов
//            System.out.print(arr[j] + " ");
//        System.out.println("");
////--------------------------------------------------------------
//        searchKey = 66; // Поиск элемента с ключом 66
//        for(j=0; j<nElems; j++) { // Для каждого элемента
//            if (arr[j] == searchKey) // Значение найдено?
//                break; // Да - выход из цикла
//        }
//            if (j == nElems) // Достигнут последний элемент?
//                System.out.println("Can't find " + searchKey); // Да
//            else
//                System.out.println("Found " + searchKey); // Нет
////--------------------------------------------------------------
//        searchKey = 55; // Удаление элемента с ключом 55
//        for(j=0; j<nElems; j++) // Поиск удаляемого элемента
//            if(arr[j] == searchKey)
//                break;
//        for(int k=j; k<nElems-1; k++) // Сдвиг последующих элементов
//            arr[k] = arr[k+1];
//        nElems--; // Уменьшение размера
////--------------------------------------------------------------
//        for(j=0; j<nElems; j++) // Вывод элементов
//            System.out.print( arr[j] + " ");
//        System.out.println("");
//    }
//} // Конец класса ArrayApp