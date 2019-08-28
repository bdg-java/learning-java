package com.bdg.Homework.HuffmanCode;

import java.util.PriorityQueue;
import java.util.Scanner;

import static com.bdg.Homework.HuffmanCode.Print.printCode;

public class Main {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);


        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };


        PriorityQueue<Node> q
                = new PriorityQueue<Node>(n, new MyComparator());

        for (int i = 0; i < n; i++) {


            Node hn = new Node();

            hn.c = charArray[i];
            hn.data = charfreq[i];

            hn.left = null;
            hn.right = null;


            q.add(hn);
        }


       Node root = null;

        while (q.size() > 1) {


           Node x = q.peek();
            q.poll();


           Node y = q.peek();
            q.poll();


           Node f = new Node();


            f.data = x.data + y.data;
            f.c = '-';

            f.left = x;

            f.right = y;

            root = f;

            q.add(f);
        }


        printCode(root, "");
    }
}

