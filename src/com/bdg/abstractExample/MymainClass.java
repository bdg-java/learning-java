package com.bdg.abstractExample;

public class MymainClass {
    public static void main(String[] args) {
        Animal mypig = new Animal() {
            @Override
            public void animalSound() {

            }
        };
       mypig.animalSound();
       mypig.sleep();
        System.out.println();
    }
}
