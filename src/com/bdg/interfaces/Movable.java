package com.bdg.interfaces;

public interface Movable {

    boolean move(int xPos, int yPos);

    boolean stop();

    void rotate(int deg);
}
