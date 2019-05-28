package ahakobyan.app_646_670;

public class app_666 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'z', 'x', 'z', 'e'};
        int n = x.length/2;
        char [] z = new char[n];
        int a = 0;

        for (int i = n -1; i <= n + 1; i++) {
            z[a++] = x[i];
        }
        System.out.println(z);
    }
}
