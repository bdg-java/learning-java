package repeatexercises;

import java.util.ArrayList;

public class App_201_210 {
    public static void main(String[] args) {
        App_201_210 app_201_210 = new App_201_210();
        System.out.println(app_201_210.app201(2));
        System.out.println(app_201_210.app205(269865));
        System.out.println(app_201_210.app208(240));
    }

    public int app201(int n) {
        int count = 0;
        for (int i = 10; ; i *= 10) {
            count++;
            if (n / i == 0) {
                break;
            }
        }

        return count;
    }

    public String app205(int n) {

        String result = "";
        for (int i = 10; ; i *= 10) {

            result += (n % i) / (i / 10);

            if (n / i == 0) {
                break;
            }

        }
        return result;
    }

    public boolean app208(int n) {
        int count = 0;
        int sum = 0;
        int num = 0;
        for (int i = 10; ; i *= 10) {
            count++;
            sum += (n % i) / (i / 10);
            if (n / i == 0) {
                break;
            }

        }

        return sum == count * n % 10;
    }

    public int app210() {
        return 0;
    }
}
