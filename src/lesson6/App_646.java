package lesson6;

public class App_646 {
    public static void main(String[] args) {
        int count = 0;
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a')
                count++;
        }
        System.out.println(count);
    }
}
