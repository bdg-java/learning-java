package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_180 {
    public static void main(String[] args) {
        int n = 81;
        boolean y = false;

        for (int i = 0; i < 10 ; i++ ) {
            if (Math.pow(n, 1.0 / i) == 3) {
                y = true;
            }
            System.out.println(y);
        }
    }
}
