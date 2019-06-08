package com.bdg.agharibyan.app_271_280;

public class App_280 {
    public static void main(String[] args) {

        int n = 9;
        char[] array = new char[]{'A', 'd', '}', 'f', 'z', '%', 'Z', 'f', 'd'};
        System.out.println(array);
        int qanak = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 'f'){
                qanak++;
            }
        }
        System.out.println(qanak);
        char [] x = new char [n+qanak];
        int j = 0;
        for (int i = 0; i < n; i++) {
            x[j] = array[i];
            j++;
            if (array[i] == 'f'){
                x[j] = array[i];
                j++;
            }
        }
        System.out.println(x);
    }
}
