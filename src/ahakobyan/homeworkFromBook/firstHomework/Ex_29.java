package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_29 {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 6;

        if (a > b && a > c && b > c) {

            System.out.println(c + " " + b + " " + a);

        }else if (b > a && b > c & a > c){

            System.out.println(c + " " + a + " " + b);

        }else if (c > a && c > b && b > a){

            System.out.println(a + " " + b + " " + c);
        }
    }
}
