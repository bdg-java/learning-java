package oldhomeworks;

public class App229 {
    public static void main(String[] args) {
        int mul=1;
        int [] arr=IntArray.getDefaultArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i]-i > 0 && arr [i] !=0 ) {
                mul=mul*arr[i] ;
            }
        }
        System.out.println(mul);
    }
}
