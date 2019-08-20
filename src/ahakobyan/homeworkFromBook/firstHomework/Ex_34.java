package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_34 {
    public static void main(String[] args) {


        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;
        boolean tmp = false;

        if ((a + b) == (c + d) || (a + c) == (b +d) || (a + d) == (b +c)) {
            tmp = true;
        }
        System.out.println(tmp);
    }
}
