package ahakobyan.threades;

public class Consumers extends Thread {



    public synchronized void run() {

        if (ClassOfList.list.size() == 10) {
            System.out.println("Consumers are removing");
            ClassOfList.list.remove();
        }
    }
}
