package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos;

public class LinuxButton implements Button {

    @Override
    public void render() {
        System.out.println("Linux Button");
    }
}
