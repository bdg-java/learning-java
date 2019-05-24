package com.bdg.agharibyan.app_646_670;

public class App_650 {
    public static void main(String[] args) {

        int n = 7;
        char [] array1 = new char [] {'0','A','z','a','*','0','z'};
        char [] array2 = new char [] {'7','A','%','k','v','0','*'};

        int qanak = 0;

        for (int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if (array1[i] == array2[k]){
                    qanak ++;
                }
            }
        }
        System.out.println(qanak);
    }
}
