package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viatransport;

public class Application {

    private static Logistics logistics;
    private static long weight = 8000000000L;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if(weight >= 1000000000){ //paymanakan ankap payman
            logistics = new SeaLogistics();
        } else if (weight >= 1000000 && weight < 1000000000){
            logistics = new AirLogistics();
        } else if (weight < 1000000){
            logistics = new RoadLogistics();
        }
    }

    static void runBusinessLogic(){
        logistics.deliver();
    }
}
