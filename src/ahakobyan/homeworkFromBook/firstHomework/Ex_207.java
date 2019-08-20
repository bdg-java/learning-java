package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_207 {
    public static void main(String[] args) {

        int n = 4835;
        int n1 = 4835 % 10;
        int n2 = (4835 / 10) % 10;
        int n3 = (4835 / 100) % 10;
        int n4 = 4835 / 1000;


        if ( n1 == 2 ) {
            System.out.println(true);
        } else if (n2 == 2) {
            System.out.println(true);
        }else if (n3 == 2) {
            System.out.println(true);
        }else if (n4 == 2) {
            System.out.println(true);
        }else
            System.out.println(false);
    }
}
