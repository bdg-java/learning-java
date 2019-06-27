package com.bdg.arrayList;

import java.util.ArrayList;

public class addArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("volvo");
        cars.add("Bmw");
        cars.add("mercedez-benz");

        cars.remove(0);

        System.out.println(cars);



        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
