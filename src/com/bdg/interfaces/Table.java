package com.bdg.interfaces;



public class Table implements Movable, Dragable {
    @Override
    public void dragTo() {

    }

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
