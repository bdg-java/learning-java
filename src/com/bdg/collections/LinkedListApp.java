package com.bdg.collections;

import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        /** Java Linked list*/
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("linked list element 0");
        linkedList.add("linked list element 1");
        linkedList.add("linked list element 2");
        linkedList.add("linked list element 3");
        linkedList.remove("linked list element 1");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);

        /** Implemented Linked list testing*/
        LinkedListImplementation<String> listImplementation = new LinkedListImplementation<>();
        listImplementation.add("impl element 0");
        listImplementation.add("impl element 1");
        listImplementation.add("impl element 2");
        listImplementation.add("impl element 3");
        listImplementation.remove("impl element 1");
        listImplementation.add("impl element 4");
        System.out.println(listImplementation.get(0));
        System.out.println(listImplementation.get(1));
        System.out.println(listImplementation.get(3));

    }
}
