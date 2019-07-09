package com.bdg.agharibyan.datastructuresandalgorithm.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {

        ArrayBubble array = new ArrayBubble(10);
        array.insert(15);
        array.insert(9);
        array.insert(19);
        array.insert(5);
        array.insert(13);
        array.insert(7);
        array.insert(11);
        array.insert(3);
        array.insert(17);
        array.insert(1);

        array.display();
        System.out.println();

        long firstRemovedElement = 31;
        if(array.remove(firstRemovedElement)) {
            System.out.println("removed " + firstRemovedElement);
        } else{
            System.out.println("can't remove " + firstRemovedElement);
        }
        long secondRemovedElement = 13;
        if(array.remove(secondRemovedElement)) {
            System.out.println("removed " + secondRemovedElement);
        } else{
            System.out.println("can't remove " + secondRemovedElement);
        }
        array.display();
        System.out.println();

        array.bubbleSort();
        System.out.println("After BubbleSort");
        array.display();
    }
}
