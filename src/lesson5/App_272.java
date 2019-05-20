package lesson5;

public class App_272 {
        public static void main(String[] args) {
            int count = 0;
            char[] array = {'a', 'b', 'c',};
            boolean t = false;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 'b') {
                    count++;
                    if (count >= array[i] / 2) {
                        t = true;
                        break;
                    }
                }
                System.out.println(t);

            }
        }
}
