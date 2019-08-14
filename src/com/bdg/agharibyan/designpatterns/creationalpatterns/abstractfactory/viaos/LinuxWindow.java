package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos;

public class LinuxWindow implements Window{

    @Override
    public void render() {
        System.out.println("Linux Window");
    }
}
