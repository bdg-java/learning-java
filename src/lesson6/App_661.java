package lesson6;

public class App_661 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'v', 'e', 'f', 'g', 'h'};
        int x = array.length;
        char[] a = new char[x];

        for (int i = 0; i < x; i++) {

            if (array[i] == 'v') {
                break;

            } else {
                a[i] = array[i];
            }
            System.out.println(a[i]);
        }
    }
}
