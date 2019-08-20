package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_202 {
    public static void main(String[] args) {

        int n = 4835;
        int n1 = 4835 % 10;
        int n2 = (4835 / 10) % 10;
        int n3 = (4835 / 100) % 10;
        int n4 = 4835 / 1000;

        System.out.println(n1 + n2 + n3 + n4);
    }
}
