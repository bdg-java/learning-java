package oldhomeworks;

public class App154 {
    public static void main(String[] args) {
        int n = 18;
        int m = 1;
        for (int i = 1; i <= 1000; i++) {
            if(n%i==3)
                m =m*i;
        }
        System.out.println(m);
    }

    }

