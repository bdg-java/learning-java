package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems;

public class LinuxButton implements Button {

    @Override
    public void render() {
        System.out.println("Linux Button");
    }

}
