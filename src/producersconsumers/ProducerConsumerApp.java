package producersconsumers;

public class ProducerConsumerApp {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer solution = new ProducerConsumer();

        for (int i = 0; i < 5; i++) {
            Thread produce = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        solution.produce();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            });


            Thread consume = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        solution.consume();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            });
            produce.start();
            consume.start();
            produce.join();
            consume.join();
        }
    }
}

