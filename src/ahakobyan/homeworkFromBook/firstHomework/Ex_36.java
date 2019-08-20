package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_36 {
    public static void main(String[] args) {


        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;

        if ((a % 2) != 0 && (b % 2 ) != 0 || (a % 2) != 0 && (c % 2) != 0 || (a % 2) != 0 && (d % 2) != 0 ) {
            System.out.println(1);
        }else if ((c % 2) != 0 && (d % 2) != 0 || (c % 2) != 0 && (b % 2) != 0) {
            System.out.println(1);
        }
        System.out.println(2);
    }
}
