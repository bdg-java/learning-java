package com.bdg.list;

import java.util.LinkedList;

public class LinkedListImplementation {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");

        linkedList.add(432);
        linkedList.add(new Object());
       int index =  linkedList.indexOf("fds5678a");
        System.out.println(linkedList);
        System.out.println(index);
    }
}
