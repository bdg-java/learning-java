package com.bdg.designpattern.factorypattern;

public class Main {
    public static void main(String[] args) {

        Logistics logistics = new SeaLogistics();
        Transport t1 = logistics.CreateTransport();
         t1.deliver();
        Logistics logistics1 = new RoadLogistics();
        Transport t2 = logistics1.CreateTransport();
        t2.deliver();

    }
}
