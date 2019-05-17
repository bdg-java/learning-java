package lesson4;

public class App_235 {
    public static void main(String[] args) {
        int c = 0;
        int sum = 0;
        int [] array = IntegerArrayOperations.getDefaultArray();

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                sum += Math.pow(array[i], 2);
                c++;
            }
            System.out.println(Math.sqrt(sum/c));
        }
    }
}
