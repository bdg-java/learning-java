package lesson4;

public class App_224 {
    public static void main(String[] args) {
        int k = 65;
        int [] array = IntegerArrayOperations.getDefaultArray();
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i]) < k) {
                System.out.println(array[i]);
                sum += Math.pow(array[i],3);
            }
            System.out.println(sum);

        }
    }
}
