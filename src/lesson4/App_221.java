package lesson4;

public class App_221 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int sum = 0;
        int [] array = IntegerArrayOperations.getDefaultArray();

        for(int i = a; i <= b; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println(sum);

    }
}
