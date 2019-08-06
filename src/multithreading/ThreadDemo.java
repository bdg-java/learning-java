package multithreading;

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.start();

        hello.start();

    }
}

class Hi extends Thread {
   public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(543);
            }catch (Exception e){

            }
        }

    }
}

class Hello extends Thread {

   public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
          try {
              Thread.sleep(543);
          }catch (Exception e){

          }
        }

    }
}