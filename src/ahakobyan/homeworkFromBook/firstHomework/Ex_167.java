package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_167 {
    public static void main(String[] args) {
        int n = 30;
        double a = 4;
        boolean y = false;

        for (double i = 0; i <= n; i++) {
            if (Math.sin(Math.pow(a, i)) < 0) {
                y = true;
            }
        }
        System.out.println(y);
    }
}
