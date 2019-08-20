package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_30 {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 6;

        if (a > b && a > c && b > c) {

            System.out.println(a + " " + b + " " + c);

        }else if (b > a && b > c & a > c){

            System.out.println(b + " " + a + " " + c);

        }else if (c > a && c > b && b > a){

            System.out.println(c + " " + b + " " + a);
        }
    }
}
