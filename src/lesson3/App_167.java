package lesson3;

public class App_167 {
    public static void main(String[] args) {
        boolean y = false;
        int x = 3;
        for (int i = 1; i <= 30; i++) {
            if (Math.sin(Math.pow(x, i)) < 0) {
                y = true;
            }
        }
        System.out.println("x = " + x + "y = " + y);
    }
}
