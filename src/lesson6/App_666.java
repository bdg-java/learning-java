package lesson6;

public class App_666 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int x = array.length / 2;
        char[] a = new char[x];
        int z = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            a[z++] = array[i];
        }
        System.out.println(a);
    }
}
