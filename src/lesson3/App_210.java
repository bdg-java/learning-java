package lesson3;

public class App_210 {
    public static void main(String[] args) {
        int x = 356;
        int sum1 = 0;
        int sum2 = 0;

        while(x>0) {
            sum1 += x % 10;
            x = x % 10;
            sum2 += x % 10;
            x = x % 10;
            if(sum1 == sum2) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");

            }
        }
    }
}
