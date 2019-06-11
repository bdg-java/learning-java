package com.bdg.car;


/**
 * @author William Arustamyan
 */


public class CarApplication {

    public static void main(String[] args) {


        Engine engine = Engine.createEngine(8, 0.3);
        Transmission transmission = Transmission.createTransmission(5);

        Car car = null;
        if (engine != null && transmission != null) {
            car = new Car("Mercedes", engine, transmission);
        }

        if (car != null) {
            double power = car.power();
            System.out.println("Power : " + power);
            car.start();
            car.addSpeed();
            car.slow();
            car.stop();
        }
    }
}
