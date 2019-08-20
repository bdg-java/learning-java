package oldhomeworks;

public class App217 {
    public static void main(String[] args) {
        int m=1;
        int [] arr=IntArray.getDefaultArray();
        int i;
        for(i=1; i<arr.length; i=i+2) {
            m=m*arr[i]*arr[i];
        }
        System.out.println(m);
    }
}
