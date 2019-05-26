package lesson6;

public class App_670 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int x = array.length;
        int count = 0;
        char[] a = new char[x];

        for (int i = 1; i < x - 1; i++) {

            if ( array[i] > array[i+1] && array[i]> array[i-1]) {
                a[i] = array[i];
                count++;

            }
        }
        System.out.println(count);
    }
}
