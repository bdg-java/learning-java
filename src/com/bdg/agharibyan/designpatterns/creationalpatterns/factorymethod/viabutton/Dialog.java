package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viabutton;

public abstract class Dialog {
    public abstract Button createButton();

    public void render(){
        Button newButton = createButton();
        newButton.render();
    }
}
