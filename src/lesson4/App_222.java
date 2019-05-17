package lesson4;

public class App_222 {
    public static void main(String[] args) {
        int c = 10;
        int d = 15;
        int mul = 1;
        int [] array = IntegerArrayOperations.getDefaultArray();

        for(int i = c; i <= d; i++) {
            mul *= array[i];
        }
        System.out.println(mul);

    }
}
