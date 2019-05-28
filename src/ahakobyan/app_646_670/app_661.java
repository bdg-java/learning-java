package ahakobyan.app_646_670;

public class app_661 {
    public static void main(String[] args) {

        char[] x = {'a', 'b', 'c', 'v', 'x', 'd', 'e'};
        char[] z = new char[x.length];

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'v') {
                break;
            }
            z[i] = x[i];
        }
        System.out.println(z);
    }
}
