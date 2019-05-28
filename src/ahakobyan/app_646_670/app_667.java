package ahakobyan.app_646_670;

public class app_667 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'z', 'x', 'z', 'e'};
        int b = 1;
        int sum = 0;

        for (int i = 0; i < x.length; i ++) {
            if (x[i] == 'z') {
                sum = sum + i;
                b = b * i;
            }
        }
        System.out.println(sum);
        System.out.println(b);
    }
}
