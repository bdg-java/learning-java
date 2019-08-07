package producerconsumer;


import java.util.ArrayList;


public class ProducerConsumer {
    public static ArrayList<Integer> arrayList= new ArrayList<Integer>(10);
    public static void main(String[] args) throws InterruptedException {

        Thread p1 = new Thread(new Producer(arrayList));
        Thread p2=new Thread(new Producer(arrayList));
        Thread p3=new Thread(new Producer(arrayList));
        Thread p4=new Thread(new Producer(arrayList));
        Thread p5=new Thread(new Producer(arrayList));
        Thread c1=new Thread(new Consumer(arrayList));
        Thread c2=new Thread(new Consumer (arrayList));
        Thread c3=new Thread(new Consumer (arrayList));
        Thread c4=new Thread(new Consumer (arrayList));
        Thread c5=new Thread(new Consumer (arrayList));



        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();

    }
    }
class Producer implements Runnable {
    private ArrayList<Integer> arrayList;

    Producer (ArrayList<Integer> arrayList) {
        this.arrayList=arrayList;

    }

    @Override
    public void run() {
        int sum=0;
        while (sum<=10) {
            synchronized (arrayList){
                arrayList.add(sum);

                sum++;
                try {
                    arrayList.notifyAll();
                    arrayList.wait();
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }System.out.println("Producer  " + sum);
        }

    }
}
class Consumer implements Runnable {
    private ArrayList<Integer> arrayList;

    Consumer (ArrayList<Integer> arrayList) {
        this.arrayList=arrayList;

    }

    @Override
    public void run() {
        int sum=0;
        while (sum<=10){
            synchronized (arrayList){
        while (arrayList.size()==0) {
            try {
                arrayList.notifyAll();
                arrayList.wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
               Integer value=arrayList.remove(0);
                System.out.println("Consumer " + sum);
                sum++;
                try {
                    arrayList.notifyAll();
                    arrayList.wait();
                    Thread.sleep(1000);
                } catch (InterruptedException ex){
                    ex.printStackTrace();
                }




            }

        }

    }
}


