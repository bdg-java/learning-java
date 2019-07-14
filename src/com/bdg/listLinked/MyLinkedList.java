package com.bdg.listLinked;

import java.util.*;

public class MyLinkedList<E> implements List<E> {

        public Node<E> head;
        int numNodes = 0;
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
            while (this.head == null) {
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
            if(element != null )
    remove(indexOf(element));
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

       for(int i=0; i<index; i++){
           current = current.next;
       }

       System.out.println(current);
        return  current.element;
    }

    private void addFirst(final E element) {

        Node<E> current = this.head;
        if (current == null) {
            this.head = new Node<>(null, element, null);
            numNodes++;
        }

        System.out.println("first element is " + " " + element);
        Node<E> temp = this.head;
        this.head = new Node<>(null, element, temp);
        numNodes++;



        System.out.println(this);
    }

    private void addLast(final E element) {
        Node<E> prev = null;
        Node<E> current = this.head;
        if (current == null) {
            this.head = new Node<>(null, element, null);
            numNodes++;
        }

        System.out.println("last element is " + " " + element);
        while (current.next != null){
            current = current.next;
        }

        current.next = new Node<>(null, element, null);


        numNodes++;
        System.out.println(this);
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        Node<E> current = this.head;

        Node <E>  keep = current.next;
        current.next = new Node<>(null,element,null);
        current.next.next = keep;

        System.out.println(this);
    }

    @Override
    public E remove(int index) {
        Node<E> current = this.head;
        Node<E> prev = null;
        if (index == 0 && current != null) {
            this.head = current.next;
            return current.element;
        }
        int k = 0;
        while (current != null) {

            if (k == index) {
                prev.next = current.next;
                System.out.println(index);
                break;
            }
            else {
                prev = current;
                current = current.next;
                k++;
            }
        }
        if (current == null) {
            System.out.println(index + "index not found");
        }
        numNodes--;
        return current.element;
    }

    @Override
    public int indexOf(Object o) {
            Node<E> current = this.head;
             int index =0;
                for(int i =0; i<numNodes-1; i++){
                    current = current.next;
                    if(current != null) {
                        if (o == current.element) {
                            return ++index;
                        }
                    }

                    if(o == this.head.element){
                         return 0;
                    }
                index++;


        }
        System.out.println("There is no such element");
        return -1;
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

    public void removeByKey( final E element) {
            Node<E> prev = null;
            Node<E> current = this.head;


       if (current != null && current.element == element) {
           this.head = current.next;
           System.out.println("removed element"+ " " + element  );
            --numNodes;
       }

       while (current != null && current.element != element) {
           prev = current;
           current = current.next;
       }

       if (current != null) {
          if(prev != null) {
              prev.next = current.next;

              System.out.println("removed element " + " " + element);
              --numNodes;
          }
       }
       if (current == null) {
           System.out.println(element + " not found");
       }

       System.out.println(this);


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
            MyLinkedList<Integer> list = new MyLinkedList<>();
            System.out.println(list.isEmpty());
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(50);
            System.out.println(list);
            list.addFirst(1);
            list.addLast(5);
            System.out.println(list.get(1));
            System.out.println(list);
            System.out.println(list.isEmpty());
            System.out.println(list.lastIndexOf(5));
            System.out.println("List items before delete " + list.size());
            System.out.println("List items after delete " + list.size());
            System.out.println(list.indexOf(10));
            list.remove(2);
            System.out.println(list);
            System.out.println(list.remove(2));
            System.out.println(list);
            System.out.println(list.size());



        }

}


