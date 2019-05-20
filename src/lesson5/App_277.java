package lesson5;

public class App_277 {
    public static void main(String[] args) {

        char[] a = {'a', 'b', 'c', 'd'};
        char[] b = new char[a.length];
        int x = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 'd') {
                b[x] = a[i];
                x++;
            }
        }
        System.out.println(b);
    }
}
