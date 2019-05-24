package ahakobyan.app_271_280;

public class app_280 {
    public static void main(String[] args) {

        char[] x = {'e', 'r', 'c', '4', 'f', 'j', 'k' };
        int g = x.length;
        char[] z = new char[2 * g];
        int a= 0;


        for (int i = 0; i <g; i++) {
            if (x[i] == 'f' ) {
                z[a] = x[i];
                a++;
            }
             z = new char[g + a ];
            int q = 0;

            for ( i = 0; i < g; i++) {
                if (x[i] == 'f' ) {
                    z[q] = x[i];
                    q++;
                }
            }
        }
        System.out.println(z);
    }
}
