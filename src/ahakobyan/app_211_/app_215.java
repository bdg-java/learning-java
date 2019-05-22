package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class app_215 {
    public static void main(String[] args) {

         int [] x= IntegerArrayoperations.getDefaultArray();
        double a = 0;
        int i;

        for (i= 1; i<=x.length;i++){
            if ((i &1) == 0){
                a = a + x[i];
            }
        }
        System.out.println(a);
    }
}
