package com.bdg.interfaces;

public class Tank implements Movable {

    @Override
    public boolean move(int xPos, int yPos) {
        return false;
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public void rotate(int deg) {

    }
}
