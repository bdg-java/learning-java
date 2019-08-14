package designpatterns.creational.abstractfactory;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("linux button");
    }
}