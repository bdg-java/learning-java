package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_182 {
    public static void main(String[] args) {

        int n = 81;
        int k;

        for (int i = 0; i >= 0; i++) {
            if (Math.pow(i, 2) < n) {
                k = i;
                System.out.println(k);
            }
        }
    }
}
