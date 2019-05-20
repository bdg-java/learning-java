package lesson5;

public class App_279 {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'k'};
        char[] b = new char[a.length];
        int x = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 'k') {
                b[x] = a[i];
                x++;
            }
        }
        System.out.println(b);
    }
}
