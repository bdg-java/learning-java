package repeatexercises;

public class App_251_260 {

    public static void main(String[] args) {
        int[] arr = {-9, 6, 17, 0, 81, 65,81,87,5,87,98,8,98};
        int[] arr1 = {-9,9};
        App_251_260 app_251_260 = new App_251_260();
        System.out.println(app_251_260.app251(arr));
        System.out.println(app_251_260.app254(arr1));
        System.out.println(app_251_260.app257(arr));
        System.out.println(app_251_260.app258(arr));

    }

    public int app251(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;

    }

    public int app254(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return min*max;

    }
    public int app257(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>= max) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == max){
                return i;
            }
        }

        return 0;


    }

    public int app258(int[] arr) {
        int max = arr[0];
        int index =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>= max) {
                max = arr[i];
                index = i;
            }
        }

        return index;

    }
}
