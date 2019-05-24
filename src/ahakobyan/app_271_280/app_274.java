package ahakobyan.app_271_280;

public class app_274 {
    public static void main(String[] args) {

        char[] x = {'e', 'b', 'c', '4', 'f', 'j', 'k' };
        int a = 0;
        int v = 0;

        for (int i =0; i< x.length; i++) {
            if (x[i] > 'h') {
                a = a + i;
                v ++;
            }
        }
        System.out.println((double) a/v);
    }
}
