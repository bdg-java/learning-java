package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_52 {
    public static void main(String[] args) {
        int a = 719;
        boolean t = false;

        if ((a % 10) == (a / 100) || (a % 10) == ((a /10) % 10) || (a / 100) == ((a / 10) % 10)) {
            t = true;
        }
        System.out.println(t);
    }
}
