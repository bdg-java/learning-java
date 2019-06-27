package com.bdg.Overriding;

public class Child extends Parent {
    void show(){
        System.out.println("Child's show()");
    }

    static void hide(){
        System.out.println("Hide method for child");
    }
}
