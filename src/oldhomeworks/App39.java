package oldhomeworks;

public class App39 {
    public static void main(String[] args) {
        int a=156;
        int b=1545;
        int c=54;
        int d=8944;
        int x;
        if (a > b) {
            x= a;
            a = b;
            b = x; }

        if (c > d) {
            x= c;
            c = d;
            d = x; }

        if (a > c) {
            x = a;
            a = c;
            c = x; }
        if (b > d) {
            x = b;
            b = d;
            d = x; }
        if (b > c){
            x = b;
            b = c;
            c = x; }
        System.out.print(a + " " + b + " " + c + " " + d);
    }
}
