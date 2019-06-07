package com.bdg.other;

public class Pool {
    public static void main(String[] args) {
        float speed;
        double waterQty = 0;
        int count = 0;
        for ( speed = 0.1f ; count <= 60  ; speed*=2,count++) {
            waterQty += 2*speed;
            System.out.println("Speed is: "+ speed+ ", timer: "+ count+", "+ waterQty+" liters||");
        }
    }
}
