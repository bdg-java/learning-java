package ahakobyan.app_646_670;

public class app_655 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', '4', 'f', 'd', 'e'};
        int n = x.length;
        char [] z = new char[n];

        for (int i = 0; i < n; i++) {
            z[n - i - 1] = x[i];
        }
        System.out.println(z);
    }
}
