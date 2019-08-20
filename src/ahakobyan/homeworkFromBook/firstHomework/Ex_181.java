package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_181 {
    public static void main(String[] args) {
        int n = 32;
        int k;

        for (int i = 0; i < 10; i++ ) {
            if (Math.pow(n, 1.0/i) == 2) {
              k = i;
              System.out.println(k);
            }
        }
    }
}
