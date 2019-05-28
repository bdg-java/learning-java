package ahakobyan.app_646_670;

public class app_654 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', '4', 'f', 'd', 'e'};
        char [] z = new char[x.length];
        int a = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] != 'a' )
                z[a] = x[i];
            a++;
        }
        System.out.println(z);
    }
}
