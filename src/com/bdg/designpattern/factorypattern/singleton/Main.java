package com.bdg.designpattern.factorypattern.singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject a = SingleObject.getInstance();
        System.out.println(a.name);
        SingleObject b = SingleObject.getInstance();
        b.name=(b.name).toUpperCase();
        System.out.println(b.name);

    }
}
