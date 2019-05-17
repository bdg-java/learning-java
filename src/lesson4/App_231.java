package lesson4;

public class App_231 {
    public static void main(String[] args) {
        int [] array = IntegerArrayOperations.getDefaultArray();
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                sum += Math.pow(array[i],2);
            }
            System.out.println(sum);
        }
    }
}
