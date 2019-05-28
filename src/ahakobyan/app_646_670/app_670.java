package ahakobyan.app_646_670;

public class app_670 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'z', 'x', 'z', 'e'};
        int a = 0;

        for (int i = 1; i < x.length -1; i++) {
            if (x[i] > x[i +1] && x[i] < x[i -1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
