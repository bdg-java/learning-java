package repeatexercises;

import java.util.ArrayList;

public class App_301_310 {

    public static void main(String[] args) {
        System.out.println(app301(9));
        System.out.println(app309());
    }

    public static ArrayList<Integer> app301(int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i =1;i<100;i++){
                if(i%k ==0){
                    arrayList.add(i);
                }
        }
        return arrayList;

    }

    public static ArrayList<Integer>  app309(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i =1;i<100;i++){
            if(i%2 !=0 && i%3!=0){
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
