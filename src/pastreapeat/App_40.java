package src.pastreapeat;

public class App_40 {

    public static void main(String[] args) {
        int a = 52;
        int b = 12;
        int c = 34;
        int d = 110;
        decreaseOrderSort(a,b,c,d);
    }

    public static void decreaseOrderSort(int... num) {
        int tmp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = num.length - 1; j > i; j--) {
                if (num[i] < num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
            System.out.println(num[i]);
        }
    }
}
