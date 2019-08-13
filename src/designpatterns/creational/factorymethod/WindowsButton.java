package designpatterns.creational.factorymethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("windows button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("windows click");
    }
}
