package com.bdg.collections;


import java.util.HashMap;
import java.util.Map;

/**
 * @author William Arustamyan
 */


public class LinkedList<E> {

    private Node<E> head;

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(final Node<E> prev, final E element, final Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }


    public boolean add(final E element) {
        if (this.head == null) {
            this.head = new Node<>(null, element, null);
            return true;
        }

        Node<E> current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node<>(current, element, null);
        return true;
    }

    public String toString() {

        StringBuilder out = new StringBuilder("[ ");
        out.append(this.head.element.toString());
        out.append(", ");

        Node<E> current = this.head;
        while (current.next != null) {
            out.append(current.next.element.toString());
            current = current.next;
            if (current.next != null) {
                out.append(", ");
            }
        }
        out.append(" ]");

        return out.toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        System.out.println(list);
    }

}
