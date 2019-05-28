package ahakobyan.app_646_670;

public class app_656 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', '4', 'x', 'd', 'e'};
        int n = x.length;
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i ++) {
            if (x[i] == 'x') {
                a++;
            }
        }
        char [] z = new char[n + a];
        for (int i = 0; i < n; i++) {
            if (x[i] == 'x') {
                z[b] = 'y';
                z[b + 1] = 'y';
                b++;
            } else
                z[b] = x[i];
            b++;
        }
        System.out.println(z);
    }
}
