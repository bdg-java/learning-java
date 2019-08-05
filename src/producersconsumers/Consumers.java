package producersconsumers;

public class Consumers extends Thread {

    @Override
    public synchronized void run() {
        try {

            while (true){
                wait(5000);
                if(Producers.list.size()==10){
                    System.out.println("read");
                    Producers.list.remove((int) (Math.random() * 10));
                    System.out.println(Producers.list);
                }
            }

        }catch (InterruptedException e){

        }


    }
}
