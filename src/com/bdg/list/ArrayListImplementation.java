package com.bdg.list;

import java.util.Arrays;

public class ArrayListImplementation<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int currentIndex;


    public ArrayListImplementation() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayListImplementation(int size) {
        elementData = new Object[size];
    }

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

        for (int i =0;i<elementData.length;i++) {
            if(elementData[i] == object){
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
}
