package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_53 {
    public static void main(String[] args) {
        int a = 719;
        int k = 546;

        if (a > k) {
            System.out.println(a / ((a % 10) + (a / 100) + ((a / 10) % 10)));
        }
    }
}
