package ahakobyan.app_646_670;

public class app_668 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'z', 'x', 'z', 'e'};
        char [] z = new char[x.length];
        int a = 0;

        for (int i = 0; i < x.length; i++ ) {
            if (i % 3 != 0 ) {
                z[a++] = x[i];
            }
        }
        System.out.println(z);
    }
}
