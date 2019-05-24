package ahakobyan.app_271_280;

public class app_272 {
    public static void main(String[] args) {

        char[] x = {'e', 'b', 'c', '4', 'f', 'd', 'e' };
        int n = 4;
        int a = 0;
        boolean t = false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'b') {
                a++;
                if (a >= n / 2) {
                    t = true;
                }
            }
        }
        System.out.println(t);

    }
}
