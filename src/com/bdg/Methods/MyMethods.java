package com.bdg.Methods;

public class MyMethods {

    int x = 1;
    static void myMethod(String varr){
        //System.out.println("ok");
        System.out.println("Name : " + " " + varr);
    }

    public static void main(String[] args) {
        myMethod("Seda");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
       // we do not have value of return //
    }
}
