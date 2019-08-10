package com.bdg.designpattern.abstractfactory;

public final class LinuxUIComponentsFactory implements UIComponentsFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new Window() {
            @Override
            public void render() {
                System.out.println("Linux window");
            }
        };
    }
}
