package repeatexercises;

public class App_211_230 {

    public static void main(String[] args) {
        double[] arr = {-1.3, -3.4, 0.2, 3, -2, 5.1};
        App_211_230 app_211_230 = new App_211_230();
        System.out.println(app_211_230.app213(arr));
        System.out.println(app_211_230.app222(arr));
        System.out.println(app_211_230.app226(arr, 3.3));
        System.out.println(app_211_230.app230(arr, 3));
    }

    public double app213(double[] arr) {
        double sum = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0.0) {
                sum += Math.pow(arr[i], 2);
                length++;
            }
        }
        return Math.sqrt(sum / length);

    }

    public double app222(double[] arr) {
        int first = 2;
        int last = 8;
        double result = 1;
        for (double v : arr) {
            if (v >= first && v <= last) {
                result *= v;
            }
        }
        return result;
    }

    public int app226(double[] arr, double k) {
        int count = 0;
        for (double v : arr) {
            if (Math.abs(v) < k) {
                count++;
            }
        }

        return count;
    }

    public double app230(double[] arr, int k) {
        double sum = 0.0;
        int count = 0;
        for (double v : arr) {
            // System.out.println(v + "," + Math.round(v) % k);
            if (Math.abs(v) >= 1 && Math.round(v) % k == 0) {
                System.out.println(v);
                sum += v * v;
                count++;
            }
        }

        return Math.sqrt(sum / count);
    }
}
