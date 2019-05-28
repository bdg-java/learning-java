package ahakobyan.app_646_670;

public class app_650 {
    public static void main(String[] args) {

        char [] x = {'e', 'b', 'c', '4', 'f', 'd', 'e'};
        char [] z = {'e', 'b', 'c', '4', 'f', 'j', 'k'};
        int a = 0;

        for (int i = 0; i <x.length; i++) {
            for (int f  = 0; f < z.length; f++) {
                if (x[i] == z[f]) {
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}
