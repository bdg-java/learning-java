package lesson6;

public class App_663 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int x = array.length;
        int a = 0;
        double sum = 0;

        for(int i = 0; i < x; i++) {
            if (array[i] == 'c') {
                sum += i;
                a++;
            }
        }
        if (a > 0)
            System.out.println( sum / a);
    }
}

