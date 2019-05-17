package lesson4;

public class App_211 {
    public static void main(String[] args) {
        int [] array = {12, 0, 15, 18, 32, 40, 45, 80};
        System.out.println(array.length);
        int sum = 0;

        for(int i = 0; i < array.length; i++) {

            sum += array[i];
            System.out.println(array[i] + "");
        }

            System.out.println("" + (double) sum / array.length);
        }
    }

