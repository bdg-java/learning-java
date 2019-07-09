package collection;

import java.util.*;

public class ArraylistImplementation<E> {

    private static final int DEF_SIZE = 5;
    private int size = 0;
    private Object[] object;

    public ArraylistImplementation() {
        this.object = new Object[DEF_SIZE];
    }

    public ArraylistImplementation(int size) {
        this.object = new Object[size];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(E e) {
        if (this.object.length - 1 == size)
            increaseSize();
        this.object[this.size] = e;
        this.size++;
        return true;
    }

    private void increaseSize() {
        Object[] temp = new Object[(this.object.length + DEF_SIZE)];
        System.arraycopy(this.object, 0, temp, 0, this.object.length);
        this.object = temp;

    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            this.object[i] = null;
        }
    }

    public E get(int index) {
        if (checkIndex(index)) {
            return (E) this.object[index];
        }
        throw new IndexOutOfBoundsException();
    }

    private boolean checkIndex(int index) {
        if (index >= 0 && index <= this.object.length - 1)
            return true;
        throw new IndexOutOfBoundsException();
    }

    public E set(int index, E element) {
        if (checkIndex(index)) {
            return (E) (this.object[index] = element);
        }
        throw new IndexOutOfBoundsException();
    }

    public void add(int index, E element) {
        if (checkIndex(index)) {
            if (index == size) {
                increaseSize();
                this.size++;
            }
            this.object[index] = element;
        }
    }

    public E remove(int index) {
        Object[] obj = new Object[this.object.length];
        int j = 0;
        if (checkIndex(index)) {
            for (int i = 0; i < this.object.length; i++) {
                if (i != index)
                    obj[j++] = this.object[i];
            }
            this.size--;
            System.arraycopy(obj, 0, this.object, 0, this.object.length);
        }
        return (E) this.object;
    }

    public String toString() {
        return Arrays.toString(this.object);
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }


}
