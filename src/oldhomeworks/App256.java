package oldhomeworks;

public class App256 {
    public static void main(String[] args) {
        int [] arr=IntArray.getDefaultArray();
        int min=arr[0];
        int minindex=0;
        for(int i=1; i<arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
                minindex=i;
            }

        }
        System.out.println(min+minindex);
    }
}
