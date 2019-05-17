package lesson4;

public class App_232 {
    public static void main(String[] args) {
        int count = 0;
        int [] array = IntegerArrayOperations.getDefaultArray();

        for(int i = 0; i < array.length; i++) {
            if((array[i] & 1) == 0)
                count++;

        }
        System.out.println(count);

    }
}
