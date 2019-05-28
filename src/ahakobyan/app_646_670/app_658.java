package ahakobyan.app_646_670;

public class app_658 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', '4', 'x', 'd', 'e'};
        int a = 0;
        int n = x.length;
        char [] z = new char[n];

        for (int i = 0; i< n - 1; i=+ 2) {
                z[a] = x[i +1];
                z[a +1] = x[i];
        }
        System.out.println(z);
    }
}
