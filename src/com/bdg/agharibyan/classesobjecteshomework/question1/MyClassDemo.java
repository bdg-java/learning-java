package com.bdg.agharibyan.classesobjecteshomework.question1;

public class MyClassDemo{
    public static void main(String[] args) {
        MyClass myObject1 = new MyClass(5);
        MyClass myObject2 = new MyClass(7);



        myObject1.printX(); // tpum e myObject1-i x-i arzheqy` 5
        myObject1.incrementCount(); // myObject1i hamar county 1ov metsacnum e.
        MyClass.incrementCount(); // vorpeszi ashkhati methody grel em static, ev county gumarel e 1ov
        myObject1.printCount(); // tpum e county
        myObject2.printCount(); // tpum e county
        myObject2.printX(); // tpum e myObject2-i x-i arzheqy` 7
        myObject1.setX(14); // setter method chunenq grats, vor set ani 14y, error e berum, avelacrel em setter, ev arden ashkhatum e
        myObject1.incrementCount(); // myObject1i hamar county 1ov metsacnum e.
        myObject1.printX(); // tpum e myObject1-i x-i arzheqy` 5
        myObject1.printCount(); // tpum e county
        myObject2.printCount(); // tpum e county

    }
}