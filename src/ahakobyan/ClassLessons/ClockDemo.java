package ahakobyan.ClassLessons;

public class ClockDemo {
    public static void main(String[] args) {

        Clock clock = new Clock(9120);
        System.out.println(clock);

        Clock clock1 = new Clock(7568);
        System.out.println(clock1);
        Clock clock2 = new Clock(2376);
        System.out.println(clock2);
        clock1.addClock(clock2);
        System.out.println(clock1);
    }
}
