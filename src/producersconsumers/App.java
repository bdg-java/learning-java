package producersconsumers;

public class App {


    public static void main(String[] args) throws InterruptedException {

        int n = 5;
        for (int i=0; i<n; i++)
        {

            Producers producers = new Producers();
            producers.start();
            Consumers consumers = new Consumers();
            consumers.start();
            producers.join();
            consumers.join();

        }
    }
}
