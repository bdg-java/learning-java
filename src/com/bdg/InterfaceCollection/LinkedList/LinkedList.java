package com.bdg.InterfaceCollection.LinkedList;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

    int numNodes = 0;
    static Node head;

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

    @Override
    public int size() {
        return this.numNodes;
    }

    @Override
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
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
        numNodes++;
        return true;
    }

    @Override
    public boolean remove(Object element) {
        if (element != null) {
            remove(indexOf(element));
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        Node<E> current = this.head;
        while (current != null) {
            this.head = new Node<>(null, null, null);
        }
        this.head = new Node<>(null, null, null);
    }

    @Override
    public E get(int index) {
        Node<E> current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;

        }
        return current.element;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        Node<E> current = this.head;

        Node<E> save = current.next;
        current.next = new Node<>(null, element, null);
        current.next.next = save;

        System.out.println(this);
    }

    @Override
    public E remove(int index) {
        Node<E> current = this.head;
        Node<E> prev = null;

        if (current != null && index == 0){
            this.head = current.next;
            return current.element;
        }
        int i = 0;
        while (current != null) {

            if (i == index) {
                prev.next = current.next;
                System.out.println(index);
                break;
            }
            else {
                prev = current;
                current = current.next;
                i++;
            }
        }
        if (current == null) {
            System.out.println(index + "Wrong index ");
        }
        numNodes--;
        return current.element;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }





        public static void main(String[] args) {

            LinkedList<Integer> list = new LinkedList<>();
            System.out.println(list.isEmpty());
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(5);
//            System.out.println(list);
            System.out.println(list.get(1));
//            System.out.println(list);
            System.out.println(list.isEmpty());
            System.out.println(list.lastIndexOf(5));
            System.out.println("List items before delete " + list.size());
            System.out.println("List items after delete " + list.size());
            System.out.println(list.indexOf(10));
            list.remove(1);
//            System.out.println(list);
            System.out.println(list.remove(1));
//            System.out.println(list);
            System.out.println(list.size());

        }
    }

