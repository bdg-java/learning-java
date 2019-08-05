package producersconsumers;

import java.util.LinkedList;

public class Producers extends Thread {
    boolean flag = true;
    public static LinkedList<Integer> list = new LinkedList<>();

    public synchronized void run() {

        try {
            while (flag) {

                if (list.size() != 10) {
                    System.out.println("write");

                    list.add((int) (Math.random() * 100));
                    System.out.println(list);
                } else {
                    System.out.println("before producers wait");
                   wait(7000);

                }
            }

        } catch (InterruptedException e) {

        }


    }


}
