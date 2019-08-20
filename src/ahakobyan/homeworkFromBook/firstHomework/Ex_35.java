package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_35 {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;
        boolean tmp = false;

        if (a == (b + c + d) || b == (a + c + d) || c == (a + b + d) || d == (a + b + c)) {
            tmp =true;
        }
    }
}
