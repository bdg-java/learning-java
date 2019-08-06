package ahakobyan.threades;

public class Threades {
    public static void main(String[] args) throws InterruptedException {

       int a = 10;
       while (a > 0) {

           Producers producers = new Producers();
           Consumers consumers = new Consumers();

           producers.run();
           producers.run();
           producers.run();
           producers.run();
           producers.run();
           consumers.run();
           consumers.run();
           consumers.run();
           consumers.run();
           consumers.run();
           producers.join();
           producers.join();
           producers.join();
           producers.join();
           producers.join();
           consumers.join();
           consumers.join();
           consumers.join();
           consumers.join();
           consumers.join();
       }
        System.out.println(ClassOfList.list);
    }
}
