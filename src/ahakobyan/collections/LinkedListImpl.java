package ahakobyan.collections;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImpl<E> implements List<E> {

    private int size = 0;
    private Node<E> head;

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
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
        for (Node<E> current = this.head; current!= null; current = current.next) {
            if (current.element.equals(o)) {
                return true;
            }
        }
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
    public boolean add(E e) {
        Node<E> current;
        if (this.head == null) {
            this. head = new Node<>(e, null, null);
            this.size++;
            return true;
        }
        current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<E>(e,current,null);
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (indexOf(o) > -1) {
            remove(indexOf(o));
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
        while(current.next != null) {
            Node<E> a = current.next;
            current.prev = current.next = null;
            current.element = null;
            current = a;
        }
        this.head = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    private boolean checkIndex(int index) {
        if (index >= 0 && index < size)
            return true;
        throw new IndexOutOfBoundsException();
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> current = this.head;
        for (int i = 0; i < index ; i++) {
            current = current.next;
        }
        return current.element = element;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        E temp = null;
        if (index == size) {
            add(element);
        }else {
            Node<E> current = this.head;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    temp = current.element;
                    current.element = element;
                }
                if (i > index) {
                    E old = current.element;
                    current.element = temp;
                    temp = old;
                }
                current = current.next;
            }
            add(temp);
        }
        this.size++;
    }

    @Override
    public E remove(int index) {
        Node<E> current = this.head;
        E removed = null;
        if (index == 0) {
            removed = head.element;
            head = head.next;
            head.prev = null;
        }else {
            for (int i = 0; i < size ; i++) {
                if (i == index) {
                    removed = current.element;
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    break;
                }
                current = current.next;
            }
        }
        return removed;
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

    public String toString() {
        StringBuilder out = new StringBuilder("[ ");
        out.append(this.head.element.toString());
        if (this.head.next != null)
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
}
