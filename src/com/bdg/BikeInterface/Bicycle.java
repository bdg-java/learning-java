package com.bdg.BikeInterface;

public class Bicycle implements Vehicle{
    int speed;
    int geer;

    public void speedUp(int increament){
        this.speed += increament;
    }

    @Override
    public void applyBrakes(int decreament) {
        this.speed -= decreament;
    }

    @Override
    public void changeGeer(int newGeer) {
        this.geer = newGeer;
    }

    public void printStates(){
        System.out.println("speed:" + speed
        + "geer:" +  geer
        );
    }
}
