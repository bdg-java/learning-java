package lesson6;

public class App_667 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 'z') {
                sum += i + 1;
                mult *= i + 1;
            }
        }
        System.out.println("Sum = " + sum + " Mult " + mult);
    }
}
