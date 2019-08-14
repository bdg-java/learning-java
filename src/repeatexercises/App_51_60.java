package repeatexercises;

public class App_51_60 {
    public static void main(String[] args) {
        App_51_60 app_51_60 = new App_51_60();
        System.out.println(app_51_60.app51(189));
        System.out.println(app_51_60.app54(875));
        System.out.println(app_51_60.app59(931));

    }

    public boolean app51(int eranish) {
        boolean t = false;
        int miavor = eranish % 10;
        int tasnavor = (eranish % 100) / 10;
        int hayruvor = eranish / 100;
        if(miavor == tasnavor+hayruvor){
            t = true;
        }
        return t;
    }


    public int app54(int eranish) {

        int miavor = eranish % 10;
        int max= miavor;
        int tasnavor = (eranish % 100) / 10;
        if(tasnavor>max){
            max = tasnavor;
        }
        int hayruvor = eranish / 100;
        if(hayruvor>max){
            max = hayruvor;
        }
        return max;
    }

    public int app57(int eranish) {
        int result;
        int miavor = eranish % 10;
        int tasnavor = (eranish % 100) / 10;
        int hayruvor = eranish / 100;
        if(eranish>300){
            result = tasnavor/miavor;
        }else {
            result = hayruvor/miavor;
        }
        return result;
    }

    public String app59(int eranish) {

        int miavor = eranish % 10;
        int min = miavor;
        int max = miavor;
        int mid = miavor;
        int tasnavor = (eranish % 100) / 10;
        if(tasnavor <min){
            min= tasnavor;
        }else {
            max = tasnavor;
        }
        int hayruvor = eranish / 100;
        if(hayruvor<min){
            min = hayruvor;
        }else {
            max = hayruvor;
        }

        if(min != tasnavor || max!=tasnavor){
            mid = tasnavor;
        }else {
            mid = hayruvor;
        }



        return min+","+mid+","+max;
    }
}
