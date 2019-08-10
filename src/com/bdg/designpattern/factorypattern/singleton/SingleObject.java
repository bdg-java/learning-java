package com.bdg.designpattern.factorypattern.singleton;

public class SingleObject {
    private static SingleObject instance = null;
     public String name;
    private SingleObject(){
        this.name= "Hello world";
    }

    public static SingleObject getInstance(){
        if(instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }
}
