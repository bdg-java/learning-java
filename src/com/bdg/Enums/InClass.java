package com.bdg.Enums;

public class InClass {
    enum Level{
        HIGHT,
        MIDIUM,
        LOW,
    }

    public static void main(String[] args) {
//        Level myVar = Level.MIDIUM;
//        System.out.println(myVar);
        for(Level myVar: Level.values()){
            System.out.println(myVar);
        }


    }
}
