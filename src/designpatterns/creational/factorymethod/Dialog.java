package designpatterns.creational.factorymethod;

public abstract class Dialog {

    public void renderWindow(){
        Button button =  createButton();
        button.render();
    }
    abstract Button createButton();
}
