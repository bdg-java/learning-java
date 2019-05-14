package lesson3;

public class App_160 {
    public static void main(String[] args) {
        int min = -1;
        for(int i = 100; i <= 999; i ++) {
            double x = i * 16;
            if(Math.sqrt(x) * 1 == 0.0) {
                min = i;
                break;
            }
        }
        System.out.println(min);

    }
}
