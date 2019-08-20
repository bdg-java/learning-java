package oldhomeworks;

public class App236 {
    public static void main(String[] args) {
        int count=0;
        int mul=1;
        int [] arr=IntArray.getDefaultArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==1) {
                count++;
                mul=mul*arr[i];

            }
        }
        System.out.println("Count=" +count+  " " +"Mul=" +mul);

    }
}
