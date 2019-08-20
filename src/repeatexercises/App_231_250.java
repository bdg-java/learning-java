package repeatexercises;

public class App_231_250 {

    public static void main(String[] args) {
        int[] arr={2,3,9,1,8,-4,-4,7};
        int[] arr1={2,5,3,9,8,3,7,5,-4,-5};
        App_231_250 app_231_250 = new App_231_250();
        System.out.println(app_231_250.app233(arr));
        System.out.println(app_231_250.app242(arr,2));
        System.out.println(app_231_250.app244(arr));
        System.out.println(app_231_250.app246(arr1));
    }

    public String app233(int[] arr) {
        int sum =0;
        int mult =1;
        for (int i : arr) {
            if(i%2==0){
                sum+=i;
                mult*=i;
            }
        }

        return "sum is "+sum+" multiply "+mult;

    }

    public int app242(int[] arr,int m) {
        if(m==0){
            throw  new IllegalArgumentException();
        }

        int result =1;
        for (int i : arr) {
            if(i%m==0){
                result*=i;
            }
        }

        return  result;

    }

    public int app244(int[] arr) {

        int result =1;
        for (int i : arr) {
            if(i%5==2){
                result*=i;
            }
        }

        return  result;

    }

    public double app246(int[] arr) {
        int count =0;
        int sum = 0;

        for(int i=2;i<arr.length;i++){
            double sqrt =Math.sqrt(i);
            if(sqrt*sqrt==i){
                System.out.println("index "+ i);
                count++;
                sum+=arr[i];
            }
        }
            if(count == 0){
                return 0;
            }else {
                return (double) sum/count;

            }

    }
}
