package com.bdg.Homework.HuffmanCode;

import java.util.Comparator;

public class MyComparator implements Comparator<Node> {
    public int compare(Node x, Node y) {

        return x.data - y.data;
    }

}
