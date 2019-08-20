package oldhomeworks;

public class App250 {
    public static void main(String[] args) {
        int mul=1;
        int [] arr=IntArray.getDefaultArray();
        for (int i=0; i<arr.length; i++) {
            if ((arr[i]*i)%3==2)
                mul=mul*arr[i]*arr[i];

        }
        System.out.println(mul);
    }
}
