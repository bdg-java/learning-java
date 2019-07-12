package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImplementation<E> implements List<E> {
    private Node<E> head;
    private int size = 0;

    public static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public boolean add(final E e) {
        Node<E> current;
        if (this.head == null) {
            this.head = new Node<E>(null, e, null);
            this.size++;
            return true;
        }
        current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<E>(current, e, null);
        this.size++;
        return true;
    }


    @Override
    public void clear() {
        Node<E> current = this.head;
        while (current.next != null) {
            Node<E> temp = current.next;
            current.prev = current.next = null;
            current.element = null;
            current = temp;
        }
        this.head = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    private boolean checkIndex(int index) {
        if (index >= 0 && index <= size)
            return true;
        throw new IndexOutOfBoundsException();
    }


    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> current = this.head;
        for (int i = 0; i < index; i++) {
            System.out.println("i = " + i);
            current = current.next;
        }
        return current.element = element;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        E temp = null;
        if (index == size)
            add(element);
        else {
            Node<E> current = this.head;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    temp = current.element;
                    current.element = element;
                }
                if (i > index) {
                    E oldelement = current.element;
                    current.element = temp;
                    temp = oldelement;
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
        E removeElement = null;
        if (index == 0) {
            removeElement = this.head.element;
            this.head = this.head.next;
            this.head.prev = null;
        } else {
            for (int i = 1; i < size; i++) {
                if (i == index) {
                    removeElement = current.element;
                    if (current.prev != null)
                        current.prev.next = current.next;

                    if (current.next != null) {
                        current.next.prev = current.prev;

                    }
                    break;
                }
                current = current.next;
            }
        }
        return removeElement;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        if (o != null) {
            for (Node<E> current = this.head; current != null; current = current.next) {
                if (o.equals(current.element))
                    return ++index;
                index++;
            }
        } else {
            for (Node<E> current = this.head; current != null; current = current.next) {
                if (current.element == null)
                    return ++index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        boolean foundposition = false;
        if (o != null) {
            for (Node<E> current = this.head; current != null; current = current.next) {
                if (o.equals(current.element))
                    foundposition = true;
                ++index;
            }
        } else {
            for (Node<E> current = this.head; current != null; current = current.next) {
                if (current.element == null)
                    foundposition = true;
                ++index;
            }
        }
        return foundposition == true ? index : -1;
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

    @Override
    public boolean remove(Object o) {
        if (indexOf(o) > -1)
            remove(indexOf(o));
        return true;
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

}


