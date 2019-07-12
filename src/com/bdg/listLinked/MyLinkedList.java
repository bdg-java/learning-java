package com.bdg.listLinked;

public class MyLinkedList<E> {

        public Node<E> head;
        int numberNodes = 0;
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
             numberNodes++;
            return true;
        }

    public void addFirst(final E element) {
        Node<E> prev = null;
        Node<E> current = this.head;
        if (current == null) {
            this.head = new Node<>(null, element, null);
        }

        System.out.println("first element is " + " " + element);
        Node<E> temp = this.head;
        this.head = new Node<>(null, element, temp);



        System.out.println(this);
    }

    public void addLast(final E element) {
        Node<E> prev = null;
        Node<E> current = this.head;
        if (current == null) {
            this.head = new Node<>(null, element, null);
        }

        System.out.println("last element is " + " " + element);
        while (current.next != null){
            current = current.next;
        }

        current.next = new Node<>(null, element, null);



        System.out.println(this);
    }

   public void addIndex(int index,E elemnet){
       Node<E> current = this.head;

       Node <E>  keep = current.next;
       current.next = new Node<>(null,elemnet,null);
       current.next.next = keep;

       System.out.println(this);

   }

   public void get(int index){
      Node<E> current = this.head;

       for(int i=0; i<index; i++){
           current = current.next;
       }

       System.out.println(current);



   }

   public void remove( final E element) {
            Node<E> prev = null;
            Node<E> current = this.head;


       if (current != null && current.element == element) {
           this.head = current.next;
           System.out.println("removed element"+ " " + element  );
       }

       while (current != null && current.element != element) {
           prev = current;
           current = current.next;
       }

       if (current != null) {
          if(prev != null) {
              prev.next = current.next;

              System.out.println("removed element " + " " + element);
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
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(50);
            System.out.println(list);
            list.remove(30);
            list.addFirst(1);
            list.addLast(5);
            list.addIndex(1,0);
            list.get(1);

        }

}


