package com.bdg.designpattern.abstractfactory;

public final class WindowsUIComponentsFactory implements UIComponentsFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new Window() {
            @Override
            public void render() {
                System.out.println("Windows window");
            }
        };
    }
}
