package com.bdg.car;


/**
 * @author William Arustamyan
 */


public class Engine {

    private Cylinder[] cylinders;
    private boolean engineWorking = false;

    private Engine(int cylinderCount, double cylinderVolume) {
        this.cylinders = new Cylinder[cylinderCount];
        for (int i = 0; i < cylinderCount; i++) {
            this.cylinders[i] = new Cylinder(cylinderVolume);
        }
    }

    public static Engine createEngine(int cylinderCount, double cylinderVolume) {
        if (cylinderCount < 0) {
            return null;
        }
        return new Engine(cylinderCount, cylinderVolume);
    }

    public double engineVolume() {
        double total = 0;
        for (int i = 0; i < this.cylinders.length; i++) {
            total = total + this.cylinders[i].volume();
        }

        return total;
    }

    public void start() {
        this.engineWorking = true;
    }

    public void stop() {
        this.engineWorking = false;
    }
}
