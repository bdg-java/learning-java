package compression;

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        PriorityQueue<String> stringPriorityQueue1 = new PriorityQueue<>();
        stringPriorityQueue.add("a");
        stringPriorityQueue.add("b");
        stringPriorityQueue.add("c");
        stringPriorityQueue.add("a");
        stringPriorityQueue.add("d");
        System.out.println(stringPriorityQueue);
        System.out.println(stringPriorityQueue.peek());
        stringPriorityQueue.add("a");
        stringPriorityQueue.add("b");
        stringPriorityQueue.add("c");
        stringPriorityQueue.add("b");
        stringPriorityQueue.add("d");
        System.out.println(stringPriorityQueue);
    }
}
