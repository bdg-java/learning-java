package lesson6;

public class App_649 {
    public static void main(String[]args){

        int n = 6;
        char [] array = new char [] {'z', 'b', 'c', 'd', 'e', 'z'};
        int count = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++){
            if(array[i] == 'z'){
                a = i;
                break;
            }
        }

        for (int i = a + 1; i < n; i++){
            if(array[i] == 'z'){
                b = i;
            }
        }

        for(int i = a + 1; i < b; i++){
            count ++;
        }
        System.out.print(count);
    }
}