package repeatexercises;

public class App_21_30 {


    public static void main(String[] args) {
        App_21_30 app_21_30 = new App_21_30();
        System.out.println(app_21_30.maxValue(30, 6, 40));

        System.out.println(app_21_30.app28(2, 5, 12.5));
    }


    public int maxValue(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public boolean app25(int a, int b, int c) {

        return (a + b > c && a + c > b || b + c > a);

    }


    public boolean app28(double a, double b, double c) {

        return (b / a == c / b);
    }


}
