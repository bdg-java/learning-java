package com.bdg.designpattern.abstractfactory;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Linux button");
    }
}
