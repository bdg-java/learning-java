package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_54 {
    public static void main(String[] args) {
        int a = 719;
        int a1 = (a % 10);
        int a2 = (a / 10);
        int a3 = ((a / 10) % 10);

        if (a1 > a2 && a1 > a3) {
            System.out.println(a1);
        } else if (a2 > a1 && a2 > a3) {
            System.out.println(a2);
        }else if (a3 > a1 && a3 > a2) {
            System.out.println(a3);
        }
    }
}