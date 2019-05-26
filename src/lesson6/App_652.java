package lesson6;

public class App_652 {
    public static void main(String[] args) {
        char count = 0;
        char[] array = {'a', 'b', 'c', 'd', 'e',};
        char[] array1 = {'a', 'b', 'c', 'd', 'e',};
        int x = array.length;

        for(int i = 0 ; i < x; i++){
            for(int k = 0; k < x; k++ ){
                if( array1[k]== array[i]){
                    count = array1[k];
                    char [] a = new char []{count};
                    for(int b = 0; b < a.length; b ++) {
                        System.out.println(a[b]);
                    }
                }
            }

        }
        System.out.println(count);

    }
}
