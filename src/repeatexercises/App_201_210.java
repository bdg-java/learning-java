package repeatexercises;

public class App_201_210 {
    public static void main(String[] args) {
        App_201_210 app_201_210 = new App_201_210();
        System.out.println(app_201_210.app201(2));
        System.out.println(app_201_210.app205(269865));
        System.out.println(app_201_210.app208(240));
        System.out.println(app_201_210.app210(240));
        System.out.println(app_201_210.app210(242891));
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

    public boolean app210(int n) {
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;
        int i = 10;
        while (n/(i/10) != 0) {
            if (count % 2 == 0) {
                sum1 += (n % i) / (i / 10);
            } else {
                sum2 += (n % i) / (i / 10);
            }
            count++;
            i = i * 10;
        }

        return sum1==sum2;
    }
}
