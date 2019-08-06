package ahakobyan.threades;

public class Producers extends Thread {

    public synchronized void run() {

        if (ClassOfList.list.size() != 10) {
            ClassOfList.list.add((int) Math.random());
            System.out.println("Producers are writing");
        }
    }
}