package com.bdg.agharibyan.vehicleinterfaceused;

public class Application {
    public static void main(String[] args) {

        Bicycle myBicycle = new Bicycle(10);
        myBicycle.changeGear(2);
        myBicycle.speedUp(3);
        myBicycle.applyBrakes(1);

        System.out.println("myBicycle present State");
        myBicycle.printStates();

        Bike myBike = new Bike();
        myBike.changeGear(3);
        myBike.speedUp(5);
        myBike.applyBrakes(2);

        System.out.println("myBike present State");
        myBike.printStates();
    }
}
