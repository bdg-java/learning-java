package com.bdg.Enums;
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
class MyClass {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}

