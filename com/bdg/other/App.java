package com.bdg.other;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class App {

    public static void main(String[] args) {


        com.bdg.Inheritance.Point.Point point = new com.bdg.Inheritance.Point.Point();
        int intSum = IntStream.of(1, 2).sum(); // 3
        long longSum = LongStream.of(3, 4).sum(); // 7
        double doubleSum = DoubleStream.of(5, 6).sum(); // 11
        System.out.println(IntStream.of(3,5).sum());
    }
}
