package src.pastreapeat;

public class App_151 {
    public static void main(String[] args) {
        naturalNumbersSum(3,6);
    }
    public static void naturalNumbersSum(int n , int range){
        int sum = 0;
        for (int i = 1; i <= range  ; i++) {
            if (i % n == 0){
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
