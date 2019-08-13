package designpatterns.creational.singleton;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        //logic

    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
