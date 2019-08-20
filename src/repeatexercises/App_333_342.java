package repeatexercises;

public class App_333_342 {

    public static void main(String[] args) {
        double[] arr = {1.2, 9, 5.6, -7, -9, 6, -1, 9};
        int[] arr1 = {1, 9, 5, -7, -9, 6, -1, 9,10,1};
        System.out.println(app334(arr));
        System.out.println(app335(arr1));
        System.out.println(app339(arr1));
        System.out.println(app341(arr1));
    }

    public static double app334(double[] arr) {
        double max = arr[0];
        for (double v : arr) {
            if (v > max) {
                max = v;
            }
        }
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == max) {
                if (i <= arr.length / 2) {
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] > 0) {
                            sum += arr[j];
                        }
                    }

                } else {
                    sum = 1;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] < 0) {

                            sum *= arr[j];
                        }
                    }
                }

                break;
            }
        }

        return sum;
    }


    public static String app335(int[] arr) {
        int max = arr[0] + arr[2];
        int index = 1;
        int value = arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] + arr[i + 1] > max) {
                max = arr[i - 1] + arr[i + 1];
                index = i;
                value = arr[i];
            }
        }

        return "index " + index + " value " + value;
    }


    public static int app339(int[] array) {
        int max = array[3];
        for (int i = 3; i < array.length; i+=3) {
            if(array[i]>max){
                max = array[i];
            }
        }

        return  max;

    }

    public static int app341(int[] arr) {
            int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        return arr.length-count;
    }
}
