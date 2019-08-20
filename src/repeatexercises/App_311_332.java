package repeatexercises;

import java.util.ArrayList;
import java.util.Arrays;

public class App_311_332 {

    public static void main(String[] args) {
        int[] arr = {6, 8, 4, 1, -7, 0,-8,9,3,0,16};
        System.out.println(app311(arr));
        System.out.println(Arrays.toString(app322(arr)));
        System.out.println(Arrays.toString(app329(arr)));
        System.out.println(app331(arr));

    }

    public static ArrayList<Integer> app311(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrayList.add(arr[i] + max);
            }
        }
        return arrayList;

    }


    public static int[] app322(int[] arr) {
        int count =0;
        for (int i : arr) {
            if(i==0){
                count++;
            }
        }
        if(count ==0) return arr;
        int[] newArray = new int[arr.length+2*count];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                newArray[++index] =0;
                newArray[++index] = 0;
            }else {
                newArray[index] = arr[i];
            }
            index++;
        }
        return newArray;
    }

    public static int[] app329(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for(int j=0;j<=i;j++){
                sum += arr[j];
            }
            newArray[i] = sum;
        }
        
        return newArray;
    }

    public static  ArrayList<Integer> app331(int[] arr){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i : arr) {
            double sqrt =Math.sqrt(i);
            if(sqrt*sqrt == i && i>0){
                integerArrayList.add(i);
            }
        }

        return integerArrayList;
    }
}
