package com.bdg.BikeInterface;

public class GFG {
    public static void main(String[] args) {
        Bicycle nnn = new Bicycle();
        nnn.speedUp(3);
        nnn.applyBrakes(1);
        nnn.changeGeer(5);

        nnn.printStates();


        Bike mmm = new Bike();
        mmm.speedUp(5);
        mmm.applyBrakes(3);
        mmm.changeGeer(2);
        mmm.PrintStates();
    }
}
