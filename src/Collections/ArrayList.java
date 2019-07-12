package Collections;
import java.util.Arrays;
public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 12;
    private Object[] elements;

    public ArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int size) {
        this.elements = new Object[size];
    }

    public boolean add(Object o) {
        if (elements.length == size) {
            increaseSize();
        }
        elements[size++] = o;
        return true;
    }

    private void increaseSize() {
        Object[] temp = new Object[(this.elements.length + DEFAULT_CAPACITY)];
        System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
        this.elements = temp;
    }

    public boolean add(int index, Object element) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        Object temp = elements[index];
        elements[index] = element;
        for (int i = index; i < size; i++) {
            if (i == index) {
                elements[i + 1] = temp;
            } else {
                elements[i] = elements[i - 1];
            }

        }
        return true;
    }
    public void clear() {
        size = 0;
    }
    public E get(int index){
        checkIndex(index);
        return (E) elements[index];
    }

    public boolean remove(Object object) {
        for (int i = 0; i<elements.length; i++) {
            if(elements[i] == object){
                remove(i);
                return true;
            }
        }
        return false;
    }
    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
}

