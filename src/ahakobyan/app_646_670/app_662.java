package ahakobyan.app_646_670;

public class app_662 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'v', 'x', 'd', 'e'};
        char [] z = new char[x.length];
        int a = 0;
        int b = 0;

        for (int i = 0; i <x.length; i++) {
            if (x[i] > 'b') {
                z[i] = x[i];
            }
            if (x[i] == 'b') {
                z[i] = x[i];
            }
            if (x[i] < 'b') {
                z[i] = x[i];
            }
        }
        System.out.println(z);
    }
}
