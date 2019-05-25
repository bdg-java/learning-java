package lesson6;

public class App_648 {
    public static void main(String[] args) {
        int count = 0;
        char[] array = {'a', 'b', 'c', 'd', 'e', 'x'};
        int n = 0;
        int k = array.length;

        for (int i = 0; i < k; i ++) {
            if(array[i] == 'x'){
                for (int j = n; j < k; j++) {
                    if (array[j] == '0') {
                        count++;
                    }
                }
            }
                System.out.print(count);

        }
        }




}
