package lesson6;

public class App_668 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int x = array.length;
        char[] a = new char[x];
        int m = 0;
        for (int i = 0; i < x; i++) {
            if (i % 3 != 0) {
                a[m++] = array[i];
            }
        }
        System.out.println(a);
    }
}
