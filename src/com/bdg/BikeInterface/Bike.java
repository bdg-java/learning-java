package com.bdg.BikeInterface;

public class Bike implements Vehicle{
    int speed;
    int geer;

    public void speedUp(int increament){
        this.speed += increament;
    }

    public void applyBrakes(int decreament){
        this.speed -= decreament;
    }

    public void changeGeer(int newGeear){
        geer = newGeear;
    }

    public void PrintStates(){
        System.out.println("speed:" + speed
        + "geer:" + geer
        );
    }
}
