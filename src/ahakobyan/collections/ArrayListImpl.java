package ahakobyan.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;



public class ArrayListImpl<E> extends ArrayList<E> implements Collection<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;
    private Object obj;

    public ArrayListImpl() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayListImpl(int size, Object obj) {
        this.elements = new Object[size];
        this.obj = obj;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if ( obj.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr<E> implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }


    @Override
    public boolean add(E e) {
        if (this.size == elements.length) {
            increaseSize();
            this.elements[this.size] = e;
            this.size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length ; i++) {
            if (obj.equals(o)) {
                obj = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    private void increaseSize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public E get(int index) {
        for (int i = 0; i < elements.length ; i++) {
            if (i == index) {
                return (E) elements[i];
            }
        }
        return null;
    }

    @Override
    public E set(int index, E element) {
        for (int i = 0; i < elements.length ; i++) {
            if (i == index) {
                 elements[i] = element;
            }
        }
        return null;
    }

    @Override
    public E remove(int index) {
        for (int i = 0; i <  elements.length; i++) {
            if (i == index) {
                elements[i] = null;
            }
        }
        return null;
    }
}