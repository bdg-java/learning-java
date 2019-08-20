package oldhomeworks;

public class App224 {
    public static void main(String[] args) {
        int k = 123;
        int sum = 0;
        int[] arr = IntArray.getDefaultArray();
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < k) ;
            sum = (int) (sum + Math.pow(arr[i], 3));
        }
        System.out.println(sum);
    }
}