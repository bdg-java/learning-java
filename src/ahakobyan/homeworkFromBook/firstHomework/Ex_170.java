package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_170 {
    public static void main(String[] args) {
        int n = 4;
        int a;


        for (int i = 5; i > n; i++) {
            if (Math.pow(i, 1.0/3) == 2) {
                a = i;
                System.out.println(a);
                break;
            }
        }
    }
}
