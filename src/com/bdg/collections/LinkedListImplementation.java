package com.bdg.collections;

import java.util.Collection;
import java.util.Iterator;

public class LinkedListImplementation<E> implements Collection<E> {

    private Node<E> head;
    private Node<E> last;
    private int size;

    private static class Node<E> {
        private Node<E> previous;
        private E element;
        private Node<E> next;

        Node(Node<E> previous, E element, Node<E> next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
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
    public boolean  add(E e) {
        Node<E> l= last;
        last =  new Node<>(l, e, null);
        if(l == null){
            head = last;
        }else {
            l.next = last;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (Node<E> x = head; x != null; x = x.next) {
            if (x.element == o) {
                x.previous.next = x.next;
                x.next.previous = x.previous;
                size--;
                return true;
            }
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
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }


    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.element == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.element.equals(o)) {
                    return index;
                }
                index++;
            }
        }


        return -1;
    }

    public E get(int index) {
        checkElementIndex(index);
        int i = 0;
        if (index == 0) {
            return head.element;
        }
        for (Node<E> x = head; x != null; x = x.next) {
            if (i == index) {
                return x.element;
            }
            i++;

        }
        return null;
    }

    private void checkElementIndex(int index) {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }

    }

}
