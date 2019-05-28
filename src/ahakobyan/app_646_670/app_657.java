package ahakobyan.app_646_670;

public class app_657 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', '4', 'x', 'd', 'e'};
        int n = x.length;
        int a = 0;
        char [] z = new char[n / 2 + 1];

        for(int i =0; i <x.length; i++ ) {
            if (x[i] > x[i +1]) {
                z[a] = x[i];
            } else
                z[a] = x[i +1];
            a++;
        }
        System.out.println(z);
    }
}
