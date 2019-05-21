package com.bdg.agharibyan.app_271_280;

public class App_279 {
    public static void main(String[] args) {

        int n = 9;
        char[] array = new char[]{'A', 'd', '}', '5', 'z', '%', 'Z', 'f', 'd'};
        System.out.println(array);
        int qanak = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 'k'){
                qanak++;
            }
        }
        char [] x = new char [qanak];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 'k'){
                x[j] = array[i];
                j++;
            }
        }
        System.out.println(x);
    }
}
