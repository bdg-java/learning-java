package com.bdg.InterfaceHomework.GeometricObjects;

import com.bdg.InterfaceHomework.GeometricObjects.Circal;
import com.bdg.InterfaceHomework.GeometricObjects.Resizable;

public class ResizableCircal extends Circal implements Resizable {

    public ResizableCircal(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius += percent/100.0;

    }
}