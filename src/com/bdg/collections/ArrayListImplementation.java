package com.bdg.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayListImplementation<T> implements Collection<T> {


    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int currentIndex;


    public ArrayListImplementation() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayListImplementation(int size) {
        elementData = new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return currentIndex == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object element : elementData) {
            if (element == o) {
                return true;
            }
        }
        return false;
    }


    @Override
    public <T1> T1[] toArray(T1[] a) {


        return Arrays.copyOf(a, currentIndex);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
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
        currentIndex = 0;
        elementData = null;
    }

    @Override
    public boolean add(Object o) {
        if (elementData.length == currentIndex) {
            increaseSize();
        }
        elementData[currentIndex++] = o;
        return true;

    }

    public boolean add(int index, Object element) {
        if (index > currentIndex) {
            throw new IndexOutOfBoundsException();
        }
        Object tmp = elementData[index];
        elementData[index] = element;
        for (int i = index; i < currentIndex; i++) {
            if (i == index) {
                elementData[i + 1] = tmp;
            } else {
                elementData[i] = elementData[i - 1];
            }

        }
        return true;

    }

    public T get(int index) {
        checkIndex(index);
        return (T) elementData[index];
    }

    public T[] remove(int index) {
        checkIndex(index);
        for (int i = index; i < currentIndex; i++) {

            elementData[i] = elementData[i + 1];
        }
        currentIndex--;
        return (T[]) elementData;
    }


    public boolean remove(Object object) {

        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == object) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return currentIndex;
    }


    private void increaseSize() {
        Object[] newElementData = new Object[elementData.length + elementData.length / 2];
        System.arraycopy(newElementData, 0, elementData, 0, elementData.length);
        elementData = newElementData;
    }


    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }

    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if (index > currentIndex) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, currentIndex);
    }

    private final class ArrayListIterator<E> implements Iterator<E> {
        int nextElementIndex;
        int lastReturnedIndex = -1;

        @Override
        public boolean hasNext() {

            return nextElementIndex != currentIndex;
        }

        @Override
        public E next() {
            if (nextElementIndex >= currentIndex) {
                throw new NoSuchElementException();
            }
            lastReturnedIndex = nextElementIndex;
            return (E) elementData[nextElementIndex++];
        }
    }
}
