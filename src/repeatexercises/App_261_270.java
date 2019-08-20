package repeatexercises;

public class App_261_270 {

    public static void main(String[] args) {
        int[] x = {9, 5, 8, 1, 77, -8, 78, 90};
        int[] y = {-3, 25, 98, -10, 77};
        App_261_270 app_261_270 = new App_261_270();
        System.out.println(app_261_270.app261(x, y));
        System.out.println(app_261_270.app264(x, y));
        System.out.println(app_261_270.app268(x, y, 5));
        System.out.println(app_261_270.app269(x, y));
    }

    public double app261(int[] x, int[] y) {
        int sumX = 0;
        int sumY = 0;
        for (int val : x) {
            sumX += val;
        }
        for (int val : y) {
            sumY += val;
        }

        return ((double) sumX / x.length) * ((double) sumY / y.length);

    }

    public int app264(int[] x, int[] y) {
        int count = 0;
        for (int i : x) {
            if (i < 0) {
                count++;
            }
        }
        for (int i : y) {
            if (i < 0) {
                count++;
            }
        }

        return count;

    }

    public int app268(int[] x, int[] y, int k) {

        int count = 0;
        for (int i : x) {
            if (i % k == 0) {
                count++;
            }
        }
        for (int i : y) {
            if (i % k == 0) {
                count++;
            }
        }
        return count;
    }

    public int app269(int[] x, int[] y) {
        int sum = 0;
        for (int i = 0; i < x.length; i+=2) {
                sum+=x[i];
        }
        for (int i = 1; i < y.length; i += 2) {
            sum += y[i];
        }

        return sum;

    }
}
