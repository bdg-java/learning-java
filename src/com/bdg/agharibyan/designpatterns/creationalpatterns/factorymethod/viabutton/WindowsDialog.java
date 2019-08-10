package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viabutton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
