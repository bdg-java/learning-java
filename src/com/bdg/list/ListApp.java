package com.bdg.list;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        //  arrayList.ad
        arrayList.add("aaa");
        arrayList.add(7890);
        arrayList.add(555);
        arrayList.add(2,343243);
        arrayList.add("qq");
        arrayList.size();
        arrayList.add(30);
        arrayList.add(null);
        //arrayList.remove(4);
        int index = arrayList.indexOf("aaa");
        System.out.println(arrayList);
        System.out.println(arrayList.get(6));


        ArrayListImplementation listImplementation = new ArrayListImplementation();
        listImplementation.add(23);
        listImplementation.add("As");
        listImplementation.add(6789);
        listImplementation.add(345);
        listImplementation.add("e423");

        System.out.println(listImplementation);
        listImplementation.remove(1);
    //    listImplementation.add(2,345);
        System.out.println(listImplementation);

    }
}
