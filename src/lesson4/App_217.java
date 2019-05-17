package lesson4;

public class App_217 {
    public static void main(String[] args) {
    int mul = 1;
    int [] array = IntegerArrayOperations.getDefaultArray();

    for(int i = 1; i < array.length; i += 2 ) {
        mul *= Math.pow(array[i], 2);

    }
    System.out.println(mul);

    }
}
