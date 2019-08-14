package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaOS;

public class LinuxWindow implements Window{

    @Override
    public void render() {
        System.out.println("Linux Window");
    }
}
