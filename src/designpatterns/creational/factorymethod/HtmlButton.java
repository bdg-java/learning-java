package designpatterns.creational.factorymethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("html button render");
        this.onClick();
    }

    @Override
    public void onClick() {
        System.out.println("html button click");
    }
}
