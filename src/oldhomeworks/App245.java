package oldhomeworks;

public class App245 {
    public static void main(String[] args) {
        int sum=0;
        int [] arr=IntArray.getDefaultArray();
        for(int i=0; i<arr.length; i++) {
            if((arr[i]+i)%3==0){
                sum=sum+arr[i]*arr[i];
            }
        }
        System.out.println(sum);
    }
}
