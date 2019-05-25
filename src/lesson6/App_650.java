package lesson6;

public class App_650 {
    public static void main(String[] args) {
        int count = 0;
        char[] array = {'a', 'b', 'c', 'd', 'e', 'x'};
        char[] array1 = {'a', 'b', 'c', 'd', 'e', 'x'};
        int x = array.length;

        for(int i = 0 ; i < x; i++){
            for(int k = 0; k < array1.length; k++ ){
                if( array1[k]== array[i]){
                    count++;
                }
            }

        }
        System.out.println(count);

        }
}
