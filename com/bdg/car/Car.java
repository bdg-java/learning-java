package com.bdg.car;


/**
 * @author William Arustamyan
 */


public class Car {

    private String mark;
    private Engine engine;
    private Transmission transmission;
    private boolean started = false;

    public Car(String mark, Engine engine, Transmission transmission) {
        this.mark = mark;
        this.engine = engine;
        this.transmission = transmission;
    }

    public void start() {
        this.started = true;
        this.engine.start();
        this.transmission.setShiftGear(1);
    }

    public void stop() {
        this.started = false;
        this.engine.stop();
        this.transmission.setShiftGear(0);
    }

    public void addSpeed() {
        if (this.started) {
            this.transmission.shiftUp();
        } else {
            System.out.println("Start the car at first");
        }
    }

    public void slow() {
        if (this.started) {
            this.transmission.shiftDown();
        } else {
            System.out.println("Start the car at first");
        }
    }

    public String mark() {
        return this.mark;
    }

    public double power() {
        return this.engine.engineVolume();
    }
}
