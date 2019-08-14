package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems;

public class LinuxWindow implements Window{

    @Override
    public void render() {
        System.out.println("Linux Window");
    }
}
