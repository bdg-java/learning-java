package classlessons;

public class ClockDemo {

    public static void main(String[] args) {
        Clock firstClock = new Clock(334322);
        System.out.println(firstClock.getSecond());
        System.out.println(firstClock.getMinute());
        for (int i = 0; i < 60; i++) {
            firstClock.tick();
            System.out.println("seconds : " + firstClock.getSecond());
        }
        System.out.println(firstClock.getMinute());
    }
}
